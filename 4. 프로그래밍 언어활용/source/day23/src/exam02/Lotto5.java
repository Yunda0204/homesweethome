package exam01;

public class Lotto5 {
    public class Main {
        public static void main(String[] args) {
            int sexBozi[] = new int[6];
            for(int ochon = 0 ; ochon < 10 ; ochon++){
                for(int i = 0 ; i < sexBozi.length ; i++){
                    int nanja = (int)(Math.random() * 45)+1;
                    sexBozi[i] = nanja;

                    for(int k = 0 ; k < i ; k++){
                        if(sexBozi[k] == sexBozi[i]){
                            i--;
                            break;
                        }
                    }
                }
                for(int i = 0 ; i < sexBozi.length ; i++){
                    if(sexBozi[i] >= 10){
                        System.out.print(sexBozi[i] + " ");
                    }
                    else{
                        System.out.print(sexBozi[i] + "  ");
                    }

                }
                System.out.println("");
            }
        }
    }
}
