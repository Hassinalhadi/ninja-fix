package K1;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import java.lang.reflect.Array;
import java.util.ArrayList;
import s6.T7;

/* loaded from: classes3.dex */
public final class x extends SpannableStringBuilder {
    public final Class alpha;
    public final ArrayList purple;

    public x(Class cls, CharSequence charSequence) {
        super(charSequence);
        this.purple = new ArrayList();
        T7.foxtrot(cls, "watcherClass cannot be null");
        this.alpha = cls;
    }

    public final void alpha() {
        int i4 = 0;
        while (true) {
            ArrayList arrayList = this.purple;
            if (i4 < arrayList.size()) {
                ((w) arrayList.get(i4)).purple.incrementAndGet();
                i4++;
            } else {
                return;
            }
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    public final void bravo() {
        echo();
        int i4 = 0;
        while (true) {
            ArrayList arrayList = this.purple;
            if (i4 < arrayList.size()) {
                ((w) arrayList.get(i4)).onTextChanged(this, 0, length(), length());
                i4++;
            } else {
                return;
            }
        }
    }

    public final w charlie(Object obj) {
        int i4 = 0;
        while (true) {
            ArrayList arrayList = this.purple;
            if (i4 < arrayList.size()) {
                w wVar = (w) arrayList.get(i4);
                if (wVar.alpha == obj) {
                    return wVar;
                }
                i4++;
            } else {
                return null;
            }
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable delete(int i4, int i5) {
        super.delete(i4, i5);
        return this;
    }

    public final boolean delta(Object obj) {
        if (obj != null) {
            if (this.alpha == obj.getClass()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void echo() {
        int i4 = 0;
        while (true) {
            ArrayList arrayList = this.purple;
            if (i4 < arrayList.size()) {
                ((w) arrayList.get(i4)).purple.decrementAndGet();
                i4++;
            } else {
                return;
            }
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanEnd(Object obj) {
        w charlie;
        if (delta(obj) && (charlie = charlie(obj)) != null) {
            obj = charlie;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanFlags(Object obj) {
        w charlie;
        if (delta(obj) && (charlie = charlie(obj)) != null) {
            obj = charlie;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanStart(Object obj) {
        w charlie;
        if (delta(obj) && (charlie = charlie(obj)) != null) {
            obj = charlie;
        }
        return super.getSpanStart(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final Object[] getSpans(int i4, int i5, Class cls) {
        if (this.alpha == cls) {
            w[] wVarArr = (w[]) super.getSpans(i4, i5, w.class);
            Object[] objArr = (Object[]) Array.newInstance((Class<?>) cls, wVarArr.length);
            for (int i10 = 0; i10 < wVarArr.length; i10++) {
                objArr[i10] = wVarArr[i10].alpha;
            }
            return objArr;
        }
        return super.getSpans(i4, i5, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i4, CharSequence charSequence) {
        super.insert(i4, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int nextSpanTransition(int i4, int i5, Class cls) {
        if (cls == null || this.alpha == cls) {
            cls = w.class;
        }
        return super.nextSpanTransition(i4, i5, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void removeSpan(Object obj) {
        w wVar;
        if (delta(obj)) {
            wVar = charlie(obj);
            if (wVar != null) {
                obj = wVar;
            }
        } else {
            wVar = null;
        }
        super.removeSpan(obj);
        if (wVar != null) {
            this.purple.remove(wVar);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i4, int i5, CharSequence charSequence) {
        replace(i4, i5, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i4, int i5, int i10) {
        if (delta(obj)) {
            w wVar = new w(obj);
            this.purple.add(wVar);
            obj = wVar;
        }
        super.setSpan(obj, i4, i5, i10);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final CharSequence subSequence(int i4, int i5) {
        return new x(this.alpha, this, i4, i5);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder delete(int i4, int i5) {
        super.delete(i4, i5);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i4, CharSequence charSequence) {
        super.insert(i4, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i4, int i5, CharSequence charSequence, int i10, int i11) {
        replace(i4, i5, charSequence, i10, i11);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i4, CharSequence charSequence, int i5, int i10) {
        super.insert(i4, charSequence, i5, i10);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i4, int i5, CharSequence charSequence) {
        alpha();
        super.replace(i4, i5, charSequence);
        echo();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(char c3) {
        super.append(c3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i4, CharSequence charSequence, int i5, int i10) {
        super.insert(i4, charSequence, i5, i10);
        return this;
    }

    public x(Class cls, x xVar, int i4, int i5) {
        super(xVar, i4, i5);
        this.purple = new ArrayList();
        T7.foxtrot(cls, "watcherClass cannot be null");
        this.alpha = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(char c3) {
        super.append(c3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(char c3) {
        super.append(c3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i4, int i5, CharSequence charSequence, int i10, int i11) {
        alpha();
        super.replace(i4, i5, charSequence, i10, i11);
        echo();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence, int i4, int i5) {
        super.append(charSequence, i4, i5);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence, int i4, int i5) {
        super.append(charSequence, i4, i5);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i4, int i5) {
        super.append(charSequence, i4, i5);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    public final SpannableStringBuilder append(CharSequence charSequence, Object obj, int i4) {
        super.append(charSequence, obj, i4);
        return this;
    }
}
