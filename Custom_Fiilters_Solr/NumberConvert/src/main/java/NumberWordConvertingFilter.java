import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.lucene.analysis.TokenFilter;
import org.apache.lucene.analysis.TokenStream;
import org.apache.lucene.analysis.tokenattributes.CharTermAttribute;

import java.io.IOException;


public final class NumberWordConvertingFilter extends TokenFilter {

    private static final Logger logger = LogManager.getLogger(NumberWordConvertingFilter.class);
    private CharTermAttribute charTermAttr;

    public NumberWordConvertingFilter(TokenStream ts) {
        super(ts);
        this.charTermAttr = addAttribute(CharTermAttribute.class);
    }

    @Override
    public boolean incrementToken() throws IOException {
        if (!input.incrementToken()) {
            return false;
        }

        int length = charTermAttr.length();
        char[] buffer = charTermAttr.buffer();

        String bufStri = new String(buffer);

        System.out.println("NumberWordConverterInputBuffer : "+ bufStri);
        logger.info("NumberWordConverterInputBuffer >> " + bufStri);

        String token="";
        for (int i = 0; i<length; i++){
                token += buffer[i];
        }
        String new_token = token;
        Boolean ending_with_k=false;
        if(token.length()>2) {
            if (token.substring(token.length() - 2).equals("ක්")) {
                ending_with_k = true;
            }
        }
        System.out.print(ending_with_k);
        new_token = token.replace("ක්","");
        NumberWordConvertor nwc = new NumberWordConvertor();
        int num = 1;
        boolean numeric = true;
        try {
            num = Integer.parseInt(new_token);
        } catch (NumberFormatException e) {
            numeric = false;
        }
        char[] outbuffer = token.toCharArray();

        if(numeric){
//            String result = nwc.NumberToWord(num);
//            if(result == "null"){
////                System.out.print("number given "+token);
//                outbuffer = token.toCharArray();
//            }
//            else{
//                if(ending_with_k){
//                    result = result+"ක්";
//                    outbuffer = result.toCharArray();
////                    System.out.print("number given "+result);
//                }
//                else{
////                    System.out.print("number given "+result);
//                    outbuffer = result.toCharArray();}
//
//            }
        }
        else{

            int result = nwc.WordToNumber(new_token);
//            System.out.print("result "+result);
            if(result == 0){
//                System.out.print("word given "+token);
                outbuffer = token.toCharArray();
            }
            else{
                if(ending_with_k){
                    String res = Integer.toString(result);
                    String res_n = res+"ක්";
                    outbuffer = res_n.toCharArray();
//                    System.out.print("number given "+res_n);
                }
                else{
                    String str_result = Integer.toString(result);

                    outbuffer = str_result.toCharArray();
//                    System.out.print("number given "+result);
                }}







        }

//        char[] newBuffer = new char[length];
//        for (int i = 0; i < length; i++) {
//            newBuffer[i] = buffer[length - 1 - i];
//        }
        charTermAttr.setEmpty();

        String bufStriOut = new String(outbuffer);

        System.out.println("NumberWordConverterOutputBuffer : "+ bufStriOut +"---->length-->"+ outbuffer.length);
        logger.info("NumberWordConverterOutputBuffer >> " + bufStriOut);



        charTermAttr.copyBuffer(outbuffer, 0, outbuffer.length);




        char[] bufferOut = charTermAttr.buffer();

        String bufStriOUTBUFFER = new String(bufferOut);

        System.out.println("NumberWordConverterOutputBuffer : "+ bufStriOUTBUFFER + "length----->"+ bufferOut.length);

//        System.out.println("NumberWordConverterOutputBuffer : "+ bufStriOut);
        return true;
    }

    public static void main(String[] args) {

    }
}



