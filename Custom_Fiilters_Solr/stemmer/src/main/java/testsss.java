import java.util.ArrayList;
import java.util.Arrays;

public class testsss {


    public static void main(String[] args) {

        char[] charTermAttr = new char[4];
        charTermAttr[0]='ක';
        charTermAttr[1]= 'න';
        charTermAttr[2]= 'ප';
        charTermAttr[3]= 'ල';

//
//        int length = charTermAttr.length();
//
//        char[] buffer = charTermAttr.buffer();

        char[] characters = new char[10];

        characters[0]='ප';
        characters[1]='ක';

        char[] charactersNew = new char[10];

        charactersNew[0]='හ';
        charactersNew[1]='ත';

        int length = charTermAttr.length;
        char[] buffer = charTermAttr;
        char[] newBuffer = buffer;
        for (int i = 0; i < length; i++) {
            for(int j=0 ; j< characters.length; j++){

                if(buffer[i]==characters[j]){

                    newBuffer[i] = charactersNew[j];

                    System.out.println(newBuffer[i]);
                }
                else{
                    newBuffer[i]= buffer[i];
                }
            }

        }


        String finalBuffer = new String(newBuffer);

        System.out.println(finalBuffer);


//        charTermAttr.setEmpty();
//        charTermAttr.copyBuffer(newBuffer, 0, newBuffer.length);
//        return true;
//
////        String token="";
////        for (int i = 0; i<length; i++){
////            token += buffer[i];
////        }
//        String token = "5ක්";
////        System.out.print(token.charAt(0)+"\n");
//        boolean numericf;
//        if(Character.isDigit(token.charAt(0))){
//            numericf = true;
//        }
//        else{
//            numericf = false;
//        }
//
//        System.out.print(numericf+"\n");
//        if(numericf){
//            token = token.replace("ක්","");
//            System.out.print("edited_token "+token);
//        }
//
////        if("පහක්".equals(token)){System.out.print("same\n");}
////        System.out.print(token+" toke\n");
////        System.out.print();
//        NumberWordConvertor nwc = new NumberWordConvertor();
//        int num = 1;
//        boolean numeric = true;
//        try {
//            num = Integer.parseInt(token);
//        } catch (NumberFormatException e) {
//            numeric = false;
//        }
//        char[] outbuffer = token.toCharArray();
//        if(numeric){
//            String result = nwc.NumberToWord(num);
//            if(result == "null"){
//                System.out.print("number given "+num);
//            }
//            else{System.out.print("number given "+result);}
//
//        }
//        else{
//
//            int result = nwc.WordToNumber(token);
//            System.out.print("result "+result);
//            if(result == 0){
//                System.out.print("number given "+token);
//            }
//            else{System.out.print("number given "+result);}
//
//        }
////    String tt = "පහක්";
////    System.out.print("\n"+tt.replace("ක්",""));
    }
}
