package exam01;

public class Lotto4 {
    public class Main {
        public static void main(String[] args) {
            int sexBozi[] = new int[6];

            for(int i = 0 ; i < sexBozi.length ; i++){
                int nanja = (int)(Math.random() * 45)+1;
                boolean check = false;
//            sexBozi[i] = nanja;

                for(int k = 0 ; k < i ; k++){
                    if(sexBozi[k] == nanja){
                        check = true;
                        break;
                    }
                }
                if(check == true){
                    i--;
                }
                else{
                    sexBozi[i] = nanja;
                    System.out.print(sexBozi[i]+" ");
                }
            }
        }
    }

// 중복검사를 어떻게 할 것이냐
// 중복 for문을 활용할거다
// if로 중복검사를 할거다
// 숫자가 같다면 같은 숫자는 갖다 치우고 다시만들어야지

}
