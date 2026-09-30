package l4;

import Xd.l;
import com.checkout.components.card.di.component.CardDIComponent;
import com.checkout.components.interfaces.uicustomisation.designtoken.DesignTokens;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ CardDIComponent.Builder alpha(CardDIComponent.Builder builder, DesignTokens designTokens, int i4, Object obj) {
        if (obj == null) {
            if ((i4 & 1) != 0) {
                designTokens = null;
            }
            return builder.appearance(designTokens);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: appearance");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CardDIComponent.Builder bravo(CardDIComponent.Builder builder, Function1 function1, int i4, Object obj) {
        if (obj == null) {
            if ((i4 & 1) != 0) {
                function1 = null;
            }
            return builder.handlePayButtonTap(function1);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: handlePayButtonTap");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CardDIComponent.Builder charlie(CardDIComponent.Builder builder, Function1 function1, int i4, Object obj) {
        if (obj == null) {
            if ((i4 & 1) != 0) {
                function1 = null;
            }
            return builder.onCardBinChanged(function1);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onCardBinChanged");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CardDIComponent.Builder delta(CardDIComponent.Builder builder, Function1 function1, int i4, Object obj) {
        if (obj == null) {
            if ((i4 & 1) != 0) {
                function1 = null;
            }
            return builder.onError(function1);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onError");
    }

    public static /* synthetic */ CardDIComponent.Builder echo(CardDIComponent.Builder builder, l lVar, int i4, Object obj) {
        if (obj == null) {
            if ((i4 & 1) != 0) {
                lVar = null;
            }
            return builder.onTokenized(lVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onTokenized");
    }
}
