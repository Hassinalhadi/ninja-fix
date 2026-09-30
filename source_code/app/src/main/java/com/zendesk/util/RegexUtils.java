package com.zendesk.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public class RegexUtils {
    private static final String QUANTIFIER_VALIDATION_REGEX = "^\\{\\d{1,},?\\d*\\}";
    private static final Pattern QUANTIFIER_PATTERN = Pattern.compile(QUANTIFIER_VALIDATION_REGEX);

    private RegexUtils() {
    }

    public static String escape(String str) {
        if (str == null) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        char[] charArray = str.toCharArray();
        int i4 = 0;
        while (i4 < charArray.length) {
            char c3 = charArray[i4];
            if (c3 == '{') {
                String validateQuantifierExpression = validateQuantifierExpression(str.substring(i4));
                if (validateQuantifierExpression != null) {
                    sb2.append(validateQuantifierExpression);
                    i4 += validateQuantifierExpression.length() - 1;
                } else {
                    sb2.append(Pattern.quote(Character.toString(c3)));
                }
            } else {
                sb2.append(c3);
            }
            i4++;
        }
        return sb2.toString();
    }

    public static String validateQuantifierExpression(String str) {
        Matcher matcher = QUANTIFIER_PATTERN.matcher(str);
        if (matcher.find()) {
            return matcher.group();
        }
        return null;
    }
}
