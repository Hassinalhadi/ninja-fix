package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class f0 extends Writer implements AutoCloseable {
    public final /* synthetic */ int alpha;
    public final Object purple;
    public final CharSequence red;

    public f0() {
        this.alpha = 0;
        this.red = new StringBuilder(128);
        this.purple = "FragmentManager";
    }

    private final void charlie() {
    }

    private final void echo() {
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence) {
        switch (this.alpha) {
            case 1:
                ((Writer) this.purple).append(charSequence);
                return this;
            default:
                return super.append(charSequence);
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.alpha) {
            case 0:
                foxtrot();
                return;
            default:
                return;
        }
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        switch (this.alpha) {
            case 0:
                foxtrot();
                return;
            default:
                return;
        }
    }

    public void foxtrot() {
        StringBuilder sb2 = (StringBuilder) this.red;
        if (sb2.length() > 0) {
            Log.d((String) this.purple, sb2.toString());
            sb2.delete(0, sb2.length());
        }
    }

    @Override // java.io.Writer
    public void write(int i4) {
        switch (this.alpha) {
            case 1:
                ((Writer) this.purple).append((char) i4);
                return;
            default:
                super.write(i4);
                return;
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Appendable append(CharSequence charSequence) {
        switch (this.alpha) {
            case 1:
                ((Writer) this.purple).append(charSequence);
                return this;
            default:
                return super.append(charSequence);
        }
    }

    @Override // java.io.Writer
    public void write(String str, int i4, int i5) {
        switch (this.alpha) {
            case 1:
                Objects.requireNonNull(str);
                ((Writer) this.purple).append((CharSequence) str, i4, i5 + i4);
                return;
            default:
                super.write(str, i4, i5);
                return;
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence, int i4, int i5) {
        switch (this.alpha) {
            case 1:
                ((Writer) this.purple).append(charSequence, i4, i5);
                return this;
            default:
                return super.append(charSequence, i4, i5);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.CharSequence, java.lang.Object] */
    public f0(Writer writer) {
        this.alpha = 1;
        this.red = new Object();
        this.purple = writer;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Appendable append(CharSequence charSequence, int i4, int i5) {
        switch (this.alpha) {
            case 1:
                ((Writer) this.purple).append(charSequence, i4, i5);
                return this;
            default:
                return super.append(charSequence, i4, i5);
        }
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i4, int i5) {
        switch (this.alpha) {
            case 0:
                for (int i10 = 0; i10 < i5; i10++) {
                    char c3 = cArr[i4 + i10];
                    if (c3 == '\n') {
                        foxtrot();
                    } else {
                        ((StringBuilder) this.red).append(c3);
                    }
                }
                return;
            default:
                com.google.gson.internal.r rVar = (com.google.gson.internal.r) this.red;
                rVar.alpha = cArr;
                rVar.purple = null;
                ((Writer) this.purple).append((CharSequence) rVar, i4, i5 + i4);
                return;
        }
    }
}
