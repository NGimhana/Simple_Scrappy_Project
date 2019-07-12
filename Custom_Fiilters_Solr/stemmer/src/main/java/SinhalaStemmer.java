public class SinhalaStemmer {

    public String sinhala_stemming(String inputTerm){

        System.out.println("STEMMERRRR INPUT: "+ inputTerm);
        if(inputTerm.equals("කනිජයක්")){System.out.println("yessssssssssssssssssssssssssssssssssssss");}
        String stemmed_output  = inputTerm;
        if(inputTerm.length()>1) {
            if (inputTerm.substring(inputTerm.length() - 1).equals("ය")) {
                stemmed_output = inputTerm.replace("ය", "");
            }
        }
        if(inputTerm.length()>2) {
            if (inputTerm.substring(inputTerm.length() - 2).equals("යක")) {
                stemmed_output = inputTerm.replace("යක", "");
            }
            if(inputTerm.substring(inputTerm.length() - 2).equals("යට")) {
                stemmed_output = inputTerm.replace("යට", "");
            }
            if(inputTerm.substring(inputTerm.length() - 2).equals("වී")) {
                stemmed_output = inputTerm.replace("වී", "");
            }
            if(inputTerm.substring(inputTerm.length() - 2).equals("වේ")) {
                stemmed_output = inputTerm.replace("වේ", "");
            }
        }
        if(inputTerm.length()>3) {
            if (inputTerm.substring(inputTerm.length() - 3).equals("යකට")) {
                stemmed_output = inputTerm.replace("යකට", "");
            }
            if (inputTerm.substring(inputTerm.length() - 3).equals("යක්")) {
                stemmed_output = inputTerm.replace("යක්", "");
            }
        }
        if(inputTerm.length()>4) {
            if(inputTerm.substring(inputTerm.length() - 4).equals("යෙන්")) {
                stemmed_output = inputTerm.replace("යෙන්", "");
            }

        }
        if(inputTerm.length()>5) {
            if (inputTerm.substring(inputTerm.length() - 5).equals("යකින්")) {
                stemmed_output = inputTerm.replace("යකින්", "");
            }

            if (inputTerm.substring(inputTerm.length() - 5).equals("වලින්")) {
                stemmed_output = inputTerm.replace("වලින්", "");
            }
        }

        return stemmed_output;
    }

    public static void main(String[] args) {
//
//
//
        SinhalaStemmer ss =  new SinhalaStemmer();
//
//        String sinOut = ss.sinhala_stemming("ඛණිඡයක්");
//
//        char[] buffer = sinOut.toCharArray();
//
//        int length = buffer.length;
//
//        char[] characters = new char[11];
//
//        characters[0]='ශ';
//        characters[1]='ණ';
//        characters[2] = 'ළ';
//        characters[3] ='ධ';
//        characters[4] ='භ';
//        characters[5] ='ඝ';
//
//        characters[6]='ඨ';
//        characters[7] = 'ඵ';
//        characters[8] ='ඪ';
//        characters[9] ='ඛ';
//        characters[10] ='ඡ';
//
//
//        char[] charactersNew = new char[11];
//
//        charactersNew[0]='ස';
//        charactersNew[1]='න';
//        charactersNew[2]='ල';
//        charactersNew[3] ='ද';
//        charactersNew[4] = 'බ';
//        charactersNew[5] = 'ග';
//
//        charactersNew[6]='ට';
//        charactersNew[7]='ප';
//        charactersNew[8] ='ඩ';
//        charactersNew[9] = 'ක';
//        charactersNew[10] = 'ච';
//
//        char[] newBuffer = buffer;
//
//        for (int i = 0; i < length; i++) {
//            for(int j=0 ; j< characters.length; j++){
//                if(buffer[i]==characters[j]){
//                    newBuffer[i] = charactersNew[j];
//                }
//                else{
//                    newBuffer[i]= buffer[i];
//                }
//            }
//
//        }
//
//
//        String ouuuuu = new String(newBuffer);
//
//        System.out.println(ouuuuu);



        System.out.println(ss.sinhala_stemming("පයක්"));
////        System.out.println(ss.sinhala_stemming("ප්\u200Dරකාශයකට"));
////        System.out.println(ss.sinhala_stemming("ප්\u200Dරකාශයක්"));
////        System.out.println(ss.sinhala_stemming("ප්\u200Dරකාශයකින්"));
////        System.out.println(ss.sinhala_stemming("ප්\u200Dරකාශයට"));
////        System.out.println(ss.sinhala_stemming("ප්\u200Dරකාශයෙන්"));
////        System.out.println(ss.sinhala_stemming("ප්\u200Dරකාශවලින්"));
////        System.out.println(ss.sinhala_stemming("ප්\u200Dරකාශවී"));
////        System.out.println(ss.sinhala_stemming("ප්\u200Dරකාශවේ"));
//
    }

}
