package day15.collection.list;

import day15.generic.Fruit;

import java.util.*;

public class ListExample {

    public static void main(String[] args) {

        //리스트 : 순차형 자료구조, 데이터가 순서대로 저장됨, 중복 저장 가능, 인덱스를 가짐
        List<String> list = new ArrayList<>();

        //리스트에 객체를 추가 : add()
        list.add("멍멍이");
        list.add("야옹이");
        list.add("짹짹이");
        list.add("개굴이");
        list.add("콩벌레");
        list.add("꽥꽥이");

        System.out.println(list);
        
        //list에 저장됨 객체 수 확인 : size()
        System.out.println("list.size() = " + list.size());

        //list에 객체 중간 삽입 : add(index, data)
        list.add(2,"어흥이");
        System.out.println(list);

        //list 객체 수정 : set(index, newdata);
        list.set(3,"메롱메롱");
        System.out.println(list);

        //list 저장객체 삭제 : remove(index), remove(obj)
        list.remove("개굴이");
        list.remove(1);
        System.out.println(list);
        
        //list 내부 객체 참조 : get(index)
        String data = list.get(2);
        System.out.println("data = " + data);

        //list 저장객체 인덱스 탐색 : indexOf(객체)
        int idx = list.indexOf("어흥이");
        System.out.println("idx = " + idx);
        
        //list 에 저장된 객체 유무 확인 : contains(obj)
        boolean b = list.contains("콩벌레");
        System.out.println("b = " + b);
        boolean b1 = list.contains("귀뚜라미");
        System.out.println("b1 = " + b1);

        //list의 반복문 처리
        System.out.println("================================");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("================================");

        for(String str : list){
            System.out.println(str);
        }

        //list내부 객체 전체 삭제 : clear()
        System.out.println("================================");
        list.clear();
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.isEmpty());

        //2차원 리스트
        List<String[]> list2dV1;
        List<List<String>> list2dV2;

        //초기값을 가진 리스트 생성
        List<Integer> numbers = new ArrayList<>(
                Arrays.asList(50,60,85,30,10,40)
        );
        System.out.println(numbers);

        //오름차 정렬
        numbers.sort(Integer/*Double String*/::compareTo);
        System.out.println(numbers);

        //내림차 정렬
        numbers.sort(Comparator.reverseOrder());
        System.out.println(numbers);
    }
}