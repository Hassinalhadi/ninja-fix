package zendesk.support.request;

import android.content.Context;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.appcompat.widget.AppCompatTextView;

/* loaded from: classes.dex */
class ViewRequestText extends AppCompatTextView {
    public ViewRequestText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    private void init() {
        setMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int selectionStart = getSelectionStart();
        int selectionEnd = getSelectionEnd();
        if (selectionStart >= 0 && selectionEnd >= 0) {
            if (selectionStart != selectionEnd && motionEvent.getActionMasked() == 0) {
                CharSequence text = getText();
                setText((CharSequence) null);
                setText(text);
            }
        } else {
            Selection.setSelection((Spannable) getText(), getText().length());
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public ViewRequestText(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        init();
    }

    public ViewRequestText(Context context) {
        super(context, null);
        init();
    }
}
