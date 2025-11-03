/**
오름차순 삽입 정렬은 '정렬된 데이터 셋에 뒤쪽에서 부터 원소를 하나씩 삽입하여 순서에 맞는 위치로 찾아가며 정렬하는 방식'이다.

이번 문제는 미리 작성된 코드를 보고 빈 칸에 들어갈 코드를 작성하는 것이다.

이 프로그램은 선택 정렬을 구현한 것이며, 실행 결과는 오름차순으로 정렬된다.

※ JAVA/Python으로 제출시 위 코드가 추가되지 않습니다.
 */

package 정렬문제모음;

import java.util.Scanner;

public class 삽입정렬 {
    
    /**
     * 삽입 정렬(Insertion Sort)을 수행하는 메소드
     * @param arr 정렬할 정수 배열
     */
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        
        // 1. 바깥 루프 (i): 정렬할 원소(Key)를 선택 (두 번째 원소(인덱스 1)부터 시작)
        for (int i = 1; i < n; i++) {
            
            // 현재 선택된 원소 (Key)
            int key = arr[i];
            
            // Key를 삽입할 위치를 찾기 위해, Key의 앞 요소부터 비교를 시작
            int j = i - 1;
            
            // 2. 안쪽 루프 (j): 정렬된 부분(앞부분)을 역순으로 탐색
            // 정렬된 부분이 있고, 현재 비교하는 요소(arr[j])가 Key보다 크다면
            while (j >= 0 && arr[j] > key) {
                
                // 비교 요소(arr[j])를 한 칸 뒤로 밀고 (자리 이동)
                arr[j + 1] = arr[j];
                
                // 다음 앞 요소로 이동하여 계속 비교
                j = j - 1;
            }
            
            // 3. 삽입: 루프가 종료된 후, 찾은 위치(j + 1)에 Key를 삽입
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 1. 입력: 첫 줄에 N (데이터의 개수)을 읽습니다.
        int N = sc.nextInt();
        
        // 2. 입력: N개의 정수를 배열에 저장합니다.
        int[] numbers = new int[N];
        for (int i = 0; i < N; i++) {
            numbers[i] = sc.nextInt();
        }
        
        // 3. 정렬: 삽입 정렬을 수행합니다.
        insertionSort(numbers);
        
        // 4. 출력: 정렬된 결과를 한 줄에 하나씩 출력합니다.
        for (int number : numbers) {
            System.out.println(number);
        }
        
        sc.close();
    }
}