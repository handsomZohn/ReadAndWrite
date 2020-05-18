package com.book.cyc2018.newCharacteristics.eeight.map;



import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class MainTest {
    public static void main(String[] args) {
        //map ������
        Map<Integer,String> map = new HashMap<Integer,String>();
        for(int i=0; i<6; i++){
            map.put(i,"val_"+i);
        }
        map.put(10,null);

        //1:����
        map.forEach((key,value) -> System.out.println(key+":"+value));
        // map.forEach((key, value) -> System.out :: println);

        //2:V getOrDefault(key,defaultValue):��ȡkeyֵ,���key����������defaultValue
        System.out.println("3-->"+map.getOrDefault(3,"val_66"));//3-->val_3
        System.out.println("10-->"+map.getOrDefault(10,"val_66"));//10-->null
        System.out.println("11-->"+map.getOrDefault(11,"val_66"));//11-->val_66

        //3:V putIfAbsent(K key, V value):����keyƥ��Node,���ƥ�䲻��������key-value,����null,���ƥ�䵽Node,���oldValue������null�򲻽���value���ǣ�����oldValue
        System.out.println(map.putIfAbsent(3,"val_66"));//val_3
        System.out.println(map.putIfAbsent(10,"val_66"));//null
        System.out.println(map.putIfAbsent(11,"val_66"));//null
        System.out.println(map.get(3)+"--"+map.get(10)+"--"+map.get(11));//val_3--val_66--val_66

        //4:boolean remove(Object key, Object value):����keyƥ��node�����valueҲ��ͬ��ɾ��
        System.out.println(map.size());//8
        map.remove(10,"66");
        map.remove(11,"val_66");
        System.out.println(map.size());//7
        System.out.println(map.toString());//{0=val_0, 1=val_1, 2=val_2, 3=val_3, 4=val_4, 5=val_5, 10=val_66}

        //5:boolean replace(K key, V oldValue, V newValue):����keyƥ��node,���valueҲ��ͬ��ʹ��newValue���Ƿ���true�����򷵻�false
        map.put(11,null);
        map.replace(3,"3","33");
        map.replace(10,"val_66","val_666666");
        map.replace(11,null,"val_11");
        map.replace(11,null,"val_11");
        System.out.println(map.toString());//{0=val_0, 1=val_1, 2=val_2, 3=val_3, 4=val_4, 5=val_5, 10=val_666666, 11=val_11}
        /** 6:
         * void replaceAll(BiFunction function)�����ô˷���ʱ��дBiFunction��Object apply(Object o, Object o2)������
         * ����oΪkey��o2Ϊvalue��������д�����߼��������¸�ֵ��
         */
        map.replaceAll((key,value) -> {
            if(key == 2){
                return value+"222";
            }
            return value;
        });
        System.out.println(map.toString());//{0=val_0, 1=val_1, 2=val_2222, 3=val_3, 4=val_4, 5=val_5, 10=val_666666, 11=val_11}
        /** 7:
         * V compute(K key,BiFunction remappingFunction)������key��ƥ�䣬����BiFunction��apply�������洢��value��
         * ƥ�䵽Node��value�滻��ƥ�䲻������node��apply�ķ���ֵ���Ϊnull��ɾ���ýڵ㣬����ΪҪ�洢��value��
         */
        System.out.println("---------------------- compute -----------------------");
        System.out.println(map.compute(3,new BiFunction() {
            @Override
            public Object apply(Object key, Object value) {
                return key+":"+value;
            }
        }));//3:val_3 -���÷���ֵ����ԭ����ֵ����������java7�ı��뷽ʽ�����¾�����java8��lanbda���ʽ
        System.out.println(map.compute(10,(key,value) -> {return value.split("_")[1];}));//666666 -���÷���ֵ����ԭ����ֵ
        System.out.println(map.compute(6,(key,value) ->  null));//null -������ֵΪnull����ɾ����keyֵ
        System.out.println(map.toString());//{0=val_0, 1=val_1, 2=val_2, 3=3:val_3, 4=val_4, 5=val_5, 10=666666, 11=val_11}
        /** 8:
         * merge(K key, V value,BiFunctionsuper V, ? super V, ? extends V> remappingFunction):
         * ���ܴ󲿷���compute��ͬ����֮ͬ������BiFunction��apply�Ĳ��������ΪoldValue��value��
         * ����mergeʱ��������value�����߼���������value��
         */
        System.out.println(map.merge(3,"val_3",(value,newValue) -> newValue));//val_3  --������ֵ����ԭ����value
        System.out.println(map.merge(10,"33334",(a,b) -> (Integer.valueOf(a)+Integer.valueOf(b))+""));//700000
        System.out.println(map.merge(8,"88",(oldValue,newValue) -> oldValue+newValue));//88 -��key������������
        System.out.println(map.merge(11,"11",(old,newValue) -> null));//null -������ֵΪnull,ɾ���ýڵ�
        System.out.println(map.toString());//{0=val_0, 1=val_1, 2=val_2, 3=val_3, 4=val_4, 5=val_5, 8=88, 10=700000}
        /** 9:
         * computeIfAbsent(K key,Functionsuper K, ? extends V> mappingFunction):
         * ����key��ƥ��Node����ƥ�䲻�����½�Ȼ�����ţ�
         * ���Node��value����ֱ�ӷ���oldValue��
         * ���û��value�����Function�ӿڵ�apply������ȡvalue������value��
         * Function�ӿڵ�apply�����Ϊkey������computeIfAbsentʱ��дFunction�ӿڿ��Ը���key�����߼�����
         * apply�ķ���ֵ��ΪҪ�洢��value��
         */
        System.out.println("----------------------computeIfAbsent------------------------");
        map.put(8,null);
        System.out.println(map.toString());//{0=val_0, 1=val_1, 2=val_2, 3=val_3, 4=val_4, 5=val_5, 8=null, 10=700000}
        System.out.println(map.computeIfAbsent(0,key -> key+"000"));//val_0  -��keyֵ���ڣ�ֱ�ӷ���oldValue
        System.out.println(map.computeIfAbsent(7,key -> "value_"+key));//value_7 -��keyƥ�䲻����ֱ������������ֵΪvalue
        System.out.println(map.computeIfAbsent(8,key -> "88"));//88 -��keyƥ�䵽�ˣ�valueΪnull������ֵ��Ϊvalue
        System.out.println(map.toString());//{0=val_0, 1=val_1, 2=val_2, 3=val_3, 4=val_4, 5=val_5, 7=value_7, 8=88, 10=700000}
        /** 10:
         * V computeIfPresent(K key,BiFunction remappingFunction)��
         * ����key��ƥ�䣬���ƥ�䲻���򷵻�null,ƥ���ϸ���BiFunction��apply������ȡvalue������value��
         * BiFunction�ӿڵ�apply�����Ϊkey��oldValue������computeIfPresentʱ��дFunction�ӿ�
         * ���Ը���key��oldValue�����߼�����apply�ķ���ֵ���Ϊnull��ɾ���ýڵ㣬����ΪҪ�洢��value��
         */
        map.remove(7);
        map.remove(8);
        map.replace(10,null);
        map.remove(0,"val_0");//valueƥ�䵽��ɾ��
        map.remove(1,"val_0");//valueƥ��ʧ�ܣ�����ɾ��
        System.out.println(map.toString());//{1=val_1, 2=val_2, 3=val_3, 4=val_4, 5=val_5, 10=null}
        System.out.println(map.computeIfPresent(3,(key,value) -> key+":"+value));//3:val_3 -��key���ڣ����ݷ���ֵ�޸�value
        System.out.println(map.computeIfPresent(0,(key, value) -> "0000"));//null -��key�����ڣ�����null,�����κβ���
        System.out.println(map.computeIfPresent(1,(key, value) -> null));//null -��key���ڣ����ݷ���ֵ�޸�value
        System.out.println(map.computeIfPresent(10,(key,value) -> "val_10"));//null -��oldValueֵΪnull��ɾ���ڵ�
        System.out.println(map.toString());//{2=val_2, 3=3:val_3, 4=val_4, 5=val_5, 10=null}
        /** �Ƚ�
         * compute������key��ƥ�䣬key,valueΪ������ƥ�䵽Node��value�滻��ƥ�䲻������node��apply�ķ���ֵΪnull��ɾ���ýڵ㡣
         * merge��oldValue��newValue��ΪΪ����������������compute����
         * computeIfAbsent������keyƥ�䣬����Ϊkey,������value��Ϊnull�������޸ģ�Ϊnull�÷���ֵ��Ϊvalue��������������
         * computeIfPresent��key,value��Ϊ����������,ԭ����ֵΪnull�������������򷵻�ֵ��Ϊ�µ�value����ԭ���������ڣ���������������ֵΪnullɾ���ýڵ�
         *
         */
    }
}

