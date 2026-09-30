package t6;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import java.util.Collection;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import me.AbstractC2120h;
import pe.InterfaceC2328d;

/* loaded from: classes2.dex */
public abstract class E3 {
    public static boolean alpha(InterfaceC2328d callableMemberDescriptor) {
        Intrinsics.echo(callableMemberDescriptor, "callableMemberDescriptor");
        if (ye.i.delta.contains(callableMemberDescriptor.getName())) {
            if (!CollectionsKt.bronze(ye.i.charlie, Ue.e.charlie(callableMemberDescriptor)) || !callableMemberDescriptor.peach().isEmpty()) {
                if (AbstractC2120h.yankee(callableMemberDescriptor)) {
                    Collection overriddenDescriptors = callableMemberDescriptor.mike();
                    Intrinsics.delta(overriddenDescriptors, "overriddenDescriptors");
                    Collection<InterfaceC2328d> collection = overriddenDescriptors;
                    if (!collection.isEmpty()) {
                        for (InterfaceC2328d it : collection) {
                            Intrinsics.delta(it, "it");
                            if (alpha(it)) {
                                return true;
                            }
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public static int bravo(int i4, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i4});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }
}
