import org.apache.lucene.analysis.TokenStream;
import org.apache.lucene.analysis.util.TokenFilterFactory;

import java.util.Map;

public class NumberWordFilterFactory extends TokenFilterFactory  {

    /**

     * @param args

     */

    public NumberWordFilterFactory(Map<String, String> args) {

        super(args);

        if (!args.isEmpty()) {

            throw new IllegalArgumentException("Unknown parameters: " + args);

        }

    }

    @Override
    public TokenStream create(TokenStream ts) {
        return new NumberWordConvertingFilter(ts);
    }
}