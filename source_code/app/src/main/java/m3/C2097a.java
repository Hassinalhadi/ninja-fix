package m3;

import g3.EnumC1741b;
import g3.EnumC1742c;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import pe.AbstractC2327c;

/* renamed from: m3.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2097a {
    public final EnumC1742c alpha;
    public final String bravo;
    public final EnumC1741b charlie;
    public final Map delta;

    public C2097a(EnumC1742c reason, String message, EnumC1741b suggestion, Map payload) {
        Intrinsics.echo(reason, "reason");
        Intrinsics.echo(message, "message");
        Intrinsics.echo(suggestion, "suggestion");
        Intrinsics.echo(payload, "payload");
        this.alpha = reason;
        this.bravo = message;
        this.charlie = suggestion;
        this.delta = payload;
    }

    public static C2097a alpha(EnumC1742c reason, String message, EnumC1741b suggestion, Map payload) {
        Intrinsics.echo(reason, "reason");
        Intrinsics.echo(message, "message");
        Intrinsics.echo(suggestion, "suggestion");
        Intrinsics.echo(payload, "payload");
        return new C2097a(reason, message, suggestion, payload);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2097a)) {
            return false;
        }
        C2097a c2097a = (C2097a) obj;
        if (this.alpha == c2097a.alpha && Intrinsics.areEqual(this.bravo, c2097a.bravo) && this.charlie == c2097a.charlie && Intrinsics.areEqual(this.delta, c2097a.delta)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.delta.hashCode() + ((this.charlie.hashCode() + AbstractC2327c.sierra(this.alpha.hashCode() * 31, 31, this.bravo)) * 31);
    }

    public final String toString() {
        return "Result(reason=" + this.alpha + ", message=" + this.bravo + ", suggestion=" + this.charlie + ", payload=" + this.delta + ")";
    }
}
