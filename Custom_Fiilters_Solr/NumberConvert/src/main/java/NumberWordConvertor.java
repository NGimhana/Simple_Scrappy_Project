public class NumberWordConvertor {


    public String NumberToWord(int inputNumber){
        String outputWord="";
        if(inputNumber == 1){ outputWord="එක"; }
        else if(inputNumber == 2){ outputWord="දෙක"; }
        else if(inputNumber == 3){ outputWord="තුන"; }
        else if(inputNumber == 4){ outputWord="හතර"; }
        else if(inputNumber == 5){ outputWord="පහ"; }
        else if(inputNumber == 6){ outputWord="හය"; }
        else if(inputNumber == 7){ outputWord="හත"; }
        else if(inputNumber == 8){ outputWord="අට"; }
        else if(inputNumber == 9){ outputWord="නවය"; }
        else if(inputNumber == 10){ outputWord="දහය"; }
        else if(inputNumber == 11){ outputWord="එකොළහ"; }
        else if(inputNumber == 12){ outputWord="දොළහ"; }
        else if(inputNumber == 13){ outputWord="දහතුන"; }
        else if(inputNumber == 14){ outputWord="දහහතර"; }
        else if(inputNumber == 15){ outputWord="පහළොව"; }
        else if(inputNumber == 16){ outputWord="දහසය"; }
        else if(inputNumber == 17){ outputWord="දහහත "; }
        else if(inputNumber == 18){ outputWord="දහඅට"; }
        else if(inputNumber == 19){ outputWord="දහනවය"; }
        else if(inputNumber == 20){ outputWord="විස්ස"; }
        else if(inputNumber == 21){ outputWord="විසි එක"; }
        else if(inputNumber == 22){ outputWord="විසි දෙක"; }
        else if(inputNumber == 23){ outputWord="විසි තුන"; }
        else if(inputNumber == 24){ outputWord="විසි හතර"; }
        else if(inputNumber == 25){ outputWord="විසි පහ"; }
        else if(inputNumber == 26){ outputWord="විසි හය"; }
        else if(inputNumber == 27){ outputWord="විසි හත"; }
        else if(inputNumber == 28){ outputWord="විසි අට"; }
        else if(inputNumber == 29){ outputWord="විසි නවය"; }
        else if(inputNumber == 30){ outputWord="තිහ"; }
        else if(inputNumber == 31){ outputWord="තිස් එක"; }



        else{
            outputWord= "null";
        }

        return outputWord;
    }
    public int WordToNumber(String inputWord){
        int outputNum=0;
        if (inputWord.equals("එක")){outputNum=1;}
        else if (inputWord.equals("දෙක")){outputNum=2;}
        else if (inputWord.equals("තුන")){outputNum=3;}
        else if (inputWord .equals("හතර")){outputNum=4;}
        else if (inputWord .equals("පහ")){outputNum=5;}
        else if (inputWord .equals("හය")){outputNum=6;}
        else if (inputWord .equals("හත")){outputNum=7;}
        else if (inputWord .equals("අට")){outputNum=8;}
        else if (inputWord .equals("නවය")){outputNum=9;}
        else if (inputWord .equals("දහය")){outputNum=10;}
        else if (inputWord.equals("එකොළහ")){outputNum=11;}
        else if (inputWord.equals("දොළහ")){outputNum=12;}
        else if (inputWord .equals("දහතුන")){outputNum=13;}
        else if (inputWord .equals("දහහතර")){outputNum=14;}
        else if (inputWord .equals("පහළොව")){outputNum=15;}
        else if (inputWord .equals("දහසය")){outputNum=16;}
        else if (inputWord .equals("දහහත")){outputNum=17;}
        else if (inputWord .equals("දහඅට")){outputNum=18;}
        else if (inputWord .equals("දහනවය")){outputNum=19;}
        else if (inputWord.equals("විස්ස")){outputNum=20;}
        else if (inputWord.equals("විසි එක")){outputNum=21;}
        else if (inputWord .equals("විසි දෙක")){outputNum=22;}
        else if (inputWord .equals("විසි තුන")){outputNum=23;}
        else if (inputWord .equals("විසි හතර")){outputNum=24;}
        else if (inputWord .equals("විසි පහ")){outputNum=25;}
        else if (inputWord .equals("විසි හය")){outputNum=26;}
        else if (inputWord .equals("විසි හත")){outputNum=27;}
        else if (inputWord .equals("විසි අට")){outputNum=28;}
        else if (inputWord .equals("විසි නවය")){outputNum=29;}
        else if (inputWord .equals("තිහ")){outputNum=30;}
        else if (inputWord .equals("තිස් එක")){outputNum=31;}
        else{outputNum=0;}
        return outputNum;
    }


    public static void main(String[] args) {
        NumberWordConvertor nwc = new NumberWordConvertor();

        System.out.println(nwc.NumberToWord(1));
//        System.out.println(nwc.NumberToWord(1));
//        System.out.println(nwc.NumberToWord(0));
//        System.out.println(nwc.WordToNumber("හක්"));

    }

}
