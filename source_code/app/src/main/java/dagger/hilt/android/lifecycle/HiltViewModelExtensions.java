package dagger.hilt.android.lifecycle;

import T1.b;
import T1.c;
import T1.e;
import androidx.lifecycle.Y;
import dagger.hilt.android.internal.lifecycle.HiltViewModelFactory;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0005\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\b\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000*\u00020\u00072\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"VMF", "LT1/c;", "Lkotlin/Function1;", "Landroidx/lifecycle/Y;", "callback", "withCreationCallback", "(LT1/c;Lkotlin/jvm/functions/Function1;)LT1/c;", "LT1/e;", "addCreationCallback", "(LT1/e;Lkotlin/jvm/functions/Function1;)LT1/c;", "hilt-android_main_java_dagger_hilt_android_lifecycle-hilt_view_model_extensions_internal_kt"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class HiltViewModelExtensions {
    @NotNull
    public static final <VMF> c addCreationCallback(@NotNull e eVar, @NotNull final Function1<? super VMF, ? extends Y> callback) {
        Intrinsics.echo(eVar, "<this>");
        Intrinsics.echo(callback, "callback");
        b CREATION_CALLBACK_KEY = HiltViewModelFactory.CREATION_CALLBACK_KEY;
        Intrinsics.delta(CREATION_CALLBACK_KEY, "CREATION_CALLBACK_KEY");
        eVar.alpha.put(CREATION_CALLBACK_KEY, new Function1<Object, Y>() { // from class: dagger.hilt.android.lifecycle.HiltViewModelExtensions$addCreationCallback$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function1
            public final Y invoke(Object obj) {
                return callback.invoke(obj);
            }
        });
        return eVar;
    }

    @NotNull
    public static final <VMF> c withCreationCallback(@NotNull c cVar, @NotNull Function1<? super VMF, ? extends Y> callback) {
        Intrinsics.echo(cVar, "<this>");
        Intrinsics.echo(callback, "callback");
        return addCreationCallback(new e(cVar), callback);
    }
}
