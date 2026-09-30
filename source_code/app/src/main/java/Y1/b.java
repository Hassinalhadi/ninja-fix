package Y1;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.net.Uri;
import android.util.AttributeSet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class b extends aa {

    /* renamed from: a, reason: collision with root package name */
    public String f2267a;
    public Intent yellow;

    public static String oscar(Context context, String str) {
        if (str != null) {
            String packageName = context.getPackageName();
            Intrinsics.delta(packageName, "getPackageName(...)");
            return kotlin.text.r.oscar(str, "${applicationId}", packageName);
        }
        return null;
    }

    @Override // Y1.aa
    public final boolean equals(Object obj) {
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof b) && super.equals(obj)) {
            Intent intent = this.yellow;
            if (intent != null) {
                z2 = intent.filterEquals(((b) obj).yellow);
            } else if (((b) obj).yellow == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2 && Intrinsics.areEqual(this.f2267a, ((b) obj).f2267a)) {
                return true;
            }
        }
        return false;
    }

    @Override // Y1.aa
    public final int hashCode() {
        int i4;
        int hashCode = super.hashCode() * 31;
        Intent intent = this.yellow;
        int i5 = 0;
        if (intent != null) {
            i4 = intent.filterHashCode();
        } else {
            i4 = 0;
        }
        int i10 = (hashCode + i4) * 31;
        String str = this.f2267a;
        if (str != null) {
            i5 = str.hashCode();
        }
        return i10 + i5;
    }

    @Override // Y1.aa
    public final void lima(Context context, AttributeSet attrs) {
        Intrinsics.echo(context, "context");
        Intrinsics.echo(attrs, "attrs");
        super.lima(context, attrs);
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attrs, aw.alpha);
        Intrinsics.delta(obtainAttributes, "obtainAttributes(...)");
        String oscar = oscar(context, obtainAttributes.getString(4));
        if (this.yellow == null) {
            this.yellow = new Intent();
        }
        Intent intent = this.yellow;
        Intrinsics.checkNotNull(intent);
        intent.setPackage(oscar);
        String string = obtainAttributes.getString(0);
        if (string != null) {
            if (string.charAt(0) == '.') {
                string = context.getPackageName() + string;
            }
            ComponentName componentName = new ComponentName(context, string);
            if (this.yellow == null) {
                this.yellow = new Intent();
            }
            Intent intent2 = this.yellow;
            Intrinsics.checkNotNull(intent2);
            intent2.setComponent(componentName);
        }
        String string2 = obtainAttributes.getString(1);
        if (this.yellow == null) {
            this.yellow = new Intent();
        }
        Intent intent3 = this.yellow;
        Intrinsics.checkNotNull(intent3);
        intent3.setAction(string2);
        String oscar2 = oscar(context, obtainAttributes.getString(2));
        if (oscar2 != null) {
            Uri parse = Uri.parse(oscar2);
            if (this.yellow == null) {
                this.yellow = new Intent();
            }
            Intent intent4 = this.yellow;
            Intrinsics.checkNotNull(intent4);
            intent4.setData(parse);
        }
        this.f2267a = oscar(context, obtainAttributes.getString(3));
        obtainAttributes.recycle();
    }

    @Override // Y1.aa
    public final String toString() {
        ComponentName componentName;
        Intent intent = this.yellow;
        String str = null;
        if (intent != null) {
            componentName = intent.getComponent();
        } else {
            componentName = null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        if (componentName != null) {
            sb2.append(" class=");
            sb2.append(componentName.getClassName());
        } else {
            Intent intent2 = this.yellow;
            if (intent2 != null) {
                str = intent2.getAction();
            }
            if (str != null) {
                sb2.append(" action=");
                sb2.append(str);
            }
        }
        String sb3 = sb2.toString();
        Intrinsics.delta(sb3, "toString(...)");
        return sb3;
    }
}
