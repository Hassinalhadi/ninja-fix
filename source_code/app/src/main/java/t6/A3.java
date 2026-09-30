package t6;

import android.graphics.Paint;
import android.os.Build;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.view.ActionMode;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import s6.T7;

/* loaded from: classes2.dex */
public abstract class A3 {
    public static q1.d charlie(AppCompatTextView appCompatTextView) {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 28) {
            return new q1.d(E2.e.november(appCompatTextView));
        }
        TextPaint textPaint = new TextPaint(appCompatTextView.getPaint());
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int breakStrategy = appCompatTextView.getBreakStrategy();
        int hyphenationFrequency = appCompatTextView.getHyphenationFrequency();
        if (appCompatTextView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else {
            boolean z2 = true;
            if (i4 >= 28 && (appCompatTextView.getInputType() & 15) == 3) {
                byte directionality = Character.getDirectionality(E2.e.delta(E2.d.charlie(appCompatTextView.getTextLocale()))[0].codePointAt(0));
                textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            } else {
                if (appCompatTextView.getLayoutDirection() != 1) {
                    z2 = false;
                }
                switch (appCompatTextView.getTextDirection()) {
                    case 2:
                        textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                        break;
                    case 3:
                        textDirectionHeuristic = TextDirectionHeuristics.LTR;
                        break;
                    case 4:
                        textDirectionHeuristic = TextDirectionHeuristics.RTL;
                        break;
                    case 5:
                        textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                        break;
                    case 6:
                        break;
                    case 7:
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                        break;
                    default:
                        if (z2) {
                            textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                            break;
                        }
                        break;
                }
            }
        }
        return new q1.d(textPaint, textDirectionHeuristic, breakStrategy, hyphenationFrequency);
    }

    public static void lima(TextView textView, int i4) {
        int i5;
        T7.echo(i4);
        if (Build.VERSION.SDK_INT >= 28) {
            E2.e.romeo(textView, i4);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (textView.getIncludeFontPadding()) {
            i5 = fontMetricsInt.top;
        } else {
            i5 = fontMetricsInt.ascent;
        }
        if (i4 > Math.abs(i5)) {
            textView.setPadding(textView.getPaddingLeft(), i4 + i5, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void mike(TextView textView, int i4) {
        int i5;
        T7.echo(i4);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (textView.getIncludeFontPadding()) {
            i5 = fontMetricsInt.bottom;
        } else {
            i5 = fontMetricsInt.descent;
        }
        if (i4 > Math.abs(i5)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i4 - i5);
        }
    }

    public static void november(TextView textView, int i4) {
        T7.echo(i4);
        if (i4 != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i4 - r0, 1.0f);
        }
    }

    public static ActionMode.Callback papa(ActionMode.Callback callback) {
        if ((callback instanceof androidx.core.widget.i) && Build.VERSION.SDK_INT >= 26) {
            return ((androidx.core.widget.i) callback).alpha;
        }
        return callback;
    }

    public static ActionMode.Callback quebec(ActionMode.Callback callback, TextView textView) {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 26 && i4 <= 27 && !(callback instanceof androidx.core.widget.i) && callback != null) {
            return new androidx.core.widget.i(callback, textView);
        }
        return callback;
    }

    public abstract int alpha(int i4, View view);

    public abstract int bravo(int i4, View view);

    public int delta(View view) {
        return 0;
    }

    public int echo() {
        return 0;
    }

    public void foxtrot(int i4, int i5) {
    }

    public void golf() {
    }

    public void hotel(int i4, View view) {
    }

    public abstract void india(int i4);

    public abstract void juliet(View view, int i4, int i5);

    public abstract void kilo(View view, float f5, float f10);

    public abstract boolean oscar(int i4, View view);
}
