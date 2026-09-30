package com.clevertap.android.sdk.utils;

import G6.e;
import a4.u;
import android.app.Activity;
import android.content.Context;
import b.c0;
import com.clevertap.android.sdk.CoreMetaData;
import com.clevertap.android.sdk.Logger;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.review.ReviewInfo;
import com.google.android.play.core.review.ReviewManager;
import com.google.android.play.core.review.ReviewManagerFactory;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\n\u001a\u00020\u000bJ@\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\u00132\u001a\u0010\u0014\u001a\u0016\u0012\f\u0012\n\u0018\u00010\u0017j\u0004\u0018\u0001`\u0016\u0012\u0004\u0012\u00020\r0\u0015R!\u0010\u0004\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/clevertap/android/sdk/utils/PlayStoreReviewHandler;", "", "<init>", "()V", "reviewManagerFactoryClass", "Ljava/lang/Class;", "getReviewManagerFactoryClass", "()Ljava/lang/Class;", "reviewManagerFactoryClass$delegate", "Lkotlin/Lazy;", "isPlayStoreReviewLibraryAvailable", "", "launchReview", "", "context", "Landroid/content/Context;", "logger", "Lcom/clevertap/android/sdk/Logger;", "onCompleted", "Lkotlin/Function0;", "onError", "Lkotlin/Function1;", "Lkotlin/Exception;", "Ljava/lang/Exception;", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PlayStoreReviewHandler {

    /* renamed from: reviewManagerFactoryClass$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy reviewManagerFactoryClass = LazyKt.lazy(new c0(24));

    public static /* synthetic */ void bravo(Function0 function0, Task task) {
        launchReview$lambda$2$lambda$1(function0, task);
    }

    public static /* synthetic */ Class charlie() {
        return reviewManagerFactoryClass_delegate$lambda$0();
    }

    private final Class<?> getReviewManagerFactoryClass() {
        return (Class) this.reviewManagerFactoryClass.getValue();
    }

    public static final void launchReview$lambda$2(ReviewManager manager, Logger logger, Function1 onError, Function0 onCompleted, Task task) {
        Intrinsics.echo(manager, "$manager");
        Intrinsics.echo(logger, "$logger");
        Intrinsics.echo(onError, "$onError");
        Intrinsics.echo(onCompleted, "$onCompleted");
        Intrinsics.echo(task, "task");
        if (task.juliet()) {
            ReviewInfo reviewInfo = (ReviewInfo) task.hotel();
            Activity currentActivity = CoreMetaData.getCurrentActivity();
            if (currentActivity != null) {
                Task launchReviewFlow = manager.launchReviewFlow(currentActivity, reviewInfo);
                Intrinsics.delta(launchReviewFlow, "launchReviewFlow(...)");
                launchReviewFlow.bravo(new u(15, onCompleted));
                return;
            } else {
                logger.debug("Could not launch Play Store Review flow: current Activity is null.");
                onError.invoke(null);
                return;
            }
        }
        logger.debug("Could not launch Play Store Review flow.", task.golf());
        onError.invoke(task.golf());
    }

    public static final void launchReview$lambda$2$lambda$1(Function0 onCompleted, Task task) {
        Intrinsics.echo(onCompleted, "$onCompleted");
        Intrinsics.echo(task, "task");
        onCompleted.invoke();
    }

    public static final Class reviewManagerFactoryClass_delegate$lambda$0() {
        try {
            return Class.forName("com.google.android.play.core.review.ReviewManagerFactory");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public final boolean isPlayStoreReviewLibraryAvailable() {
        if (getReviewManagerFactoryClass() != null) {
            return true;
        }
        return false;
    }

    public final void launchReview(@NotNull Context context, @NotNull final Logger logger, @NotNull final Function0<Unit> onCompleted, @NotNull final Function1<? super Exception, Unit> onError) {
        Intrinsics.echo(context, "context");
        Intrinsics.echo(logger, "logger");
        Intrinsics.echo(onCompleted, "onCompleted");
        Intrinsics.echo(onError, "onError");
        if (!isPlayStoreReviewLibraryAvailable()) {
            logger.debug("Could not launch Play Store Review flow: Play store review library not found.");
            onError.invoke(null);
            return;
        }
        final ReviewManager create = ReviewManagerFactory.create(context);
        Intrinsics.delta(create, "create(...)");
        Task requestReviewFlow = create.requestReviewFlow();
        Intrinsics.delta(requestReviewFlow, "requestReviewFlow(...)");
        requestReviewFlow.bravo(new e() { // from class: com.clevertap.android.sdk.utils.a
            @Override // G6.e
            public final void onComplete(Task task) {
                PlayStoreReviewHandler.launchReview$lambda$2(create, logger, onError, onCompleted, task);
            }
        });
    }
}
