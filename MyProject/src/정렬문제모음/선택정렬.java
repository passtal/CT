/**
오름차순 선택 정렬은 '가장 작은 원소를 찾아 첫번째 위치로 옮기고, 남은 원소를 또 탐색하여 그 다음 작은 원소를 찾아 두번째 위치로 옮기고, ... 이런식으로 정렬하는 방식'이다.

이번 문제는 미리 작성된 코드를 보고 빈 칸에 들어갈 코드를 작성하는 것이다.

이 프로그램은 선택 정렬을 구현한 것이며, 실행 결과는 오름차순으로 정렬된다.

※ JAVA/Python으로 제출시 위 코드가 추가되지 않습니다.
 */

/**
 * 선택 정렬(Selection Sort)을 수행하는 메소드
 * @param arr 정렬할 정수 배열
 */

package 정렬문제모음;

import java.util.Scanner;

public class 선택정렬 {
    
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        
        // 1. 바깥 루프 (i): 정렬될 위치 (0부터 n-2까지)
        // 마지막 요소는 자동으로 정렬되므로 n-1까지만 반복
        for (int i = 0; i < n - 1; i++) {
            
            // i는 현재 정렬 위치를 나타내며, 이 위치에 들어갈 최소값을 찾을 것입니다.
            int minIndex = i; // 현재 위치를 최소값 인덱스로 초기화
            
            // 2. 안쪽 루프 (j): 최소값을 찾기 위해 남은 부분 탐색 (i+1부터 끝까지)
            for (int j = i + 1; j < n; j++) {
                // 현재까지 찾은 최소값(arr[minIndex])보다 더 작은 값(arr[j])을 발견하면
                if (arr[j] < arr[minIndex]) {
                    minIndex = j; // 최소값의 인덱스를 업데이트
                }
            }
            
            // 3. 스왑 (Swap): 찾은 최소값(arr[minIndex])을 현재 정렬 위치(arr[i])로 이동
            // 이미 i가 최소값 인덱스라면 교환할 필요가 없지만, 성능 차이는 미미합니다.
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
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
        
        // 3. 정렬: 선택 정렬을 수행합니다.
        selectionSort(numbers);
        
        // 4. 출력: 정렬된 결과를 한 줄에 하나씩 출력합니다.
        for (int number : numbers) {
            System.out.println(number);
        }
        
        sc.close();
    }
}