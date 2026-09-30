package dagger.hilt.android.flags;

import android.content.Context;
import dagger.hilt.EntryPoint;
import dagger.hilt.InstallIn;
import dagger.hilt.android.EntryPointAccessors;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.Preconditions;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.util.Set;

/* loaded from: classes2.dex */
public final class FragmentGetContextFix {

    @Target({ElementType.METHOD, ElementType.PARAMETER, ElementType.FIELD})
    /* loaded from: classes2.dex */
    public @interface DisableFragmentGetContextFix {
    }

    @EntryPoint
    @InstallIn({SingletonComponent.class})
    /* loaded from: classes2.dex */
    public interface FragmentGetContextFixEntryPoint {
        @DisableFragmentGetContextFix
        Set<Boolean> getDisableFragmentGetContextFix();
    }

    @InstallIn({SingletonComponent.class})
    /* loaded from: classes2.dex */
    public static abstract class FragmentGetContextFixModule {
        @DisableFragmentGetContextFix
        public abstract Set<Boolean> disableFragmentGetContextFix();
    }

    private FragmentGetContextFix() {
    }

    public static boolean isFragmentGetContextFixDisabled(Context context) {
        boolean z2;
        Set<Boolean> disableFragmentGetContextFix = ((FragmentGetContextFixEntryPoint) EntryPointAccessors.fromApplication(context, FragmentGetContextFixEntryPoint.class)).getDisableFragmentGetContextFix();
        if (disableFragmentGetContextFix.size() <= 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        Preconditions.checkState(z2, "Cannot bind the flag @DisableFragmentGetContextFix more than once.", new Object[0]);
        if (disableFragmentGetContextFix.isEmpty()) {
            return true;
        }
        return disableFragmentGetContextFix.iterator().next().booleanValue();
    }
}
