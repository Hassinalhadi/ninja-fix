package Cb;

import kotlin.jvm.internal.Intrinsics;
import pe.AbstractC2327c;

/* loaded from: classes2.dex */
public final class c {
    public final String alpha;
    public final String bravo;
    public final String charlie;
    public final b delta;
    public final Xd.l echo;

    public c(String str, String str2, String str3, b bVar, Xd.l content) {
        Intrinsics.echo(content, "content");
        this.alpha = str;
        this.bravo = str2;
        this.charlie = str3;
        this.delta = bVar;
        this.echo = content;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (Intrinsics.areEqual(this.alpha, cVar.alpha) && Intrinsics.areEqual(this.bravo, cVar.bravo) && Intrinsics.areEqual(this.charlie, cVar.charlie) && this.delta == cVar.delta && Intrinsics.areEqual(this.echo, cVar.echo)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int sierra = AbstractC2327c.sierra(this.alpha.hashCode() * 31, 31, this.bravo);
        String str = this.charlie;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return this.echo.hashCode() + ((this.delta.hashCode() + ((sierra + hashCode) * 31)) * 31);
    }

    public final String toString() {
        return "ComponentItem(id=" + this.alpha + ", name=" + this.bravo + ", description=" + this.charlie + ", category=" + this.delta + ", content=" + this.echo + ")";
    }
}
