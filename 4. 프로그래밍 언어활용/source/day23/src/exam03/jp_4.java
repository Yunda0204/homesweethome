package exam03;

public class jp_5 {
        public static void main(String[] args) {
            int lotto[] = new int[6];

            for(int i = 0 ; i < lotto.length ; i++){
                int raffle = (int)(Math.random() * 45)+1;
                boolean check = false;
//            sexBozi[i] = nanja;

                for(int k = 0 ; k < i ; k++){
                    if(lotto[k] == raffle){
                        check = true;
                        break;
                    }
                }
                if(check == true){
                    i--;
                }
                else{
                    lotto[i] = raffle;
                    System.out.print(lotto[i]+" ");
                }
            }
        }
    }

// 중복검사를 어떻게 할 것이냐
// 중복 for문을 활용할거다
// if로 중복검사를 할거다
// 숫자가 같다면 같은 숫자는 갖다 치우고 다시만들어야지
