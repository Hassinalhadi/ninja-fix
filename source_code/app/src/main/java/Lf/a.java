package Lf;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes2.dex */
public final class a {
    public final String alpha;
    public List bravo;
    public final ArrayList charlie;
    public final HashSet delta;
    public final ArrayList echo;
    public final ArrayList foxtrot;
    public final ArrayList golf;

    public a(String serialName) {
        Intrinsics.echo(serialName, "serialName");
        this.alpha = serialName;
        this.bravo = CollectionsKt.emptyList();
        this.charlie = new ArrayList();
        this.delta = new HashSet();
        this.echo = new ArrayList();
        this.foxtrot = new ArrayList();
        this.golf = new ArrayList();
    }

    public static void alpha(a aVar, String elementName, SerialDescriptor descriptor) {
        List annotations = CollectionsKt.emptyList();
        aVar.getClass();
        Intrinsics.echo(elementName, "elementName");
        Intrinsics.echo(descriptor, "descriptor");
        Intrinsics.echo(annotations, "annotations");
        if (aVar.delta.add(elementName)) {
            aVar.charlie.add(elementName);
            aVar.echo.add(descriptor);
            aVar.foxtrot.add(annotations);
            aVar.golf.add(false);
            return;
        }
        StringBuilder victor = Q0.c.victor("Element with name '", elementName, "' is already registered in ");
        victor.append(aVar.alpha);
        throw new IllegalArgumentException(victor.toString().toString());
    }
}
