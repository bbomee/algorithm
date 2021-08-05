package programmers;

import java.util.Arrays;
import java.util.HashSet;

public class hash2 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      String[] book = {"1247", "12", "456", "567" ,"56"};
      System.out.println(solution(book));
      
     
   }
   public static boolean solution(String[] phone_book) {
      
	   boolean answer = true;
	      // 1247, 12 순서일 경우 검사가 제대로 되지 않기 떄문에
	      // 12, 1247 순서로 되도록 배열을 정렬한다.
	      Arrays.sort(phone_book);
	      
	      HashSet<String> result = new HashSet<>();
	      
	      /*
	       * 1차 for문: book 배열만큼 반복( 배열의 모든 원소 )
	       * 2차 for문: 1차포문의 book[i]번째의 string을 0인덱스 ("1247"의 1)부터 string의 length("1247"의 7)까지 하나씩 늘려가면서 0인덱스 부터 시작하는 모든 조합을 검사  
	       */
	      for(int i = 0; i < phone_book.length; i++) {
	         for(int j = 0; j < phone_book[i].length(); j++) {
	            /*
	             * set<e>.contains(내용) = set에 내용이 있는지 조회
	             * 있다면 false로 리턴  
	             */
	            if(result.contains(phone_book[i].substring(0, j))) {
	               return false;
	            }
	         }
	         // 해당 스트링의 0부터 렝스까지 반복을 마치고
	         // 만약 중복되는 값이 없었다면 set에 그 값을 넣어서 다른값과 비교할 수 있도록 한다. 
	         result.add(phone_book[i]);
	      }
	      Math.abs(2);
	      return answer;
    }

}