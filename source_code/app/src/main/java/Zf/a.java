package Zf;

import O7.j;
import kotlin.jvm.internal.Intrinsics;
import org.w3c.dom.Element;

/* loaded from: classes2.dex */
public final class a extends j {
    public final Element red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Element element) {
        super(element);
        Intrinsics.echo(element, "element");
        this.red = element;
    }
}
