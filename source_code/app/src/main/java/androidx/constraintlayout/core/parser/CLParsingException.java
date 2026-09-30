package androidx.constraintlayout.core.parser;

import Y0.a;
import androidx.appcompat.widget.P0;

/* loaded from: classes3.dex */
public class CLParsingException extends Exception {
    private final String mElementClass;
    private final int mLineNumber;
    private final String mReason;

    public CLParsingException(String str, a aVar) {
        super(str);
        this.mReason = str;
        this.mElementClass = "unknown";
        this.mLineNumber = 0;
    }

    public String reason() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.mReason);
        sb2.append(" (");
        sb2.append(this.mElementClass);
        sb2.append(" at line ");
        return P0.cyan(sb2, this.mLineNumber, ")");
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "CLParsingException (" + hashCode() + ") : " + reason();
    }
}
