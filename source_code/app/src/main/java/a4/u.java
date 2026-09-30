package a4;

import B2.ap;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.result.ActivityResult;
import androidx.camera.core.D;
import androidx.camera.core.av;
import androidx.camera.core.impl.aq;
import androidx.camera.core.impl.ar;
import androidx.compose.runtime.ax;
import androidx.lifecycle.RunnableC0643m;
import av.E;
import av.ao;
import be.InterfaceC0755a;
import com.app.base.BaseViewModel;
import com.canhub.cropper.CropImageActivity;
import com.canhub.cropper.CropImageView;
import com.checkout.components.redirecthandler.customtab.RedirectCustomTabEventLogger;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.inbox.CTInboxController;
import com.clevertap.android.sdk.task.OnFailureListener;
import com.clevertap.android.sdk.utils.PlayStoreReviewHandler;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.Task;
import com.incognia.internal.APn;
import com.incognia.internal.JMS;
import com.incognia.internal.L8H;
import com.incognia.internal.QYW;
import com.incognia.internal.V2;
import com.incognia.internal.YWS;
import com.incognia.internal.br;
import com.incognia.internal.ipc;
import d.C1534h0;
import delivery.samurai.android.ui.about.TrophiesListFragment;
import delivery.samurai.android.ui.about.viewmodel.TrophiesListViewModel;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ScheduledFuture;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import s6.AbstractC2726n7;
import t6.AbstractC3066u3;
import t6.j4;

/* loaded from: classes3.dex */
public final /* synthetic */ class u implements ah.a, androidx.camera.core.y, aq, V0.i, InterfaceC0755a, ar.a, OnFailureListener, G6.e, com.google.android.material.internal.v, G6.c, com.google.gson.internal.n, OnSuccessListener, v2.j, YWS, APn {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;

    public /* synthetic */ u(int i4, Object obj) {
        this.alpha = i4;
        this.purple = obj;
    }

    @Override // androidx.camera.core.y
    public void alpha(D d4) {
        ((androidx.camera.core.y) this.purple).alpha(d4);
    }

    @Override // be.InterfaceC0755a
    public com.google.common.util.concurrent.e apply(Object obj) {
        return (com.google.common.util.concurrent.e) ((A0.p) this.purple).invoke(obj);
    }

    @Override // com.incognia.internal.YWS
    public void b(List list) {
        L8H.b((L8H) this.purple, list);
    }

    @Override // V0.i
    public Object black(V0.h hVar) {
        switch (this.alpha) {
            case 4:
                av.h hVar2 = (av.h) this.purple;
                hVar2.getClass();
                hVar2.purple.execute(new RunnableC0643m(2, hVar2, hVar));
                return "updateSessionConfigAsync";
            case 7:
                androidx.camera.camera2.internal.compat.e eVar = (androidx.camera.camera2.internal.compat.e) this.purple;
                eVar.bravo = hVar;
                return "RequestCompleteListener[" + eVar + Constants.AES_SUFFIX;
            case 9:
                bj.j jVar = (bj.j) this.purple;
                jVar.papa = hVar;
                return "SettableFuture hashCode: " + jVar.hashCode();
            case 10:
                ((bj.l) this.purple).f3393d = hVar;
                return "SurfaceOutputImpl close future complete";
            case 13:
                ((bp.r) this.purple).kilo.set(hVar);
                return "textureViewImpl_waitForNextFrame";
            default:
                vf.ah ahVar = (vf.ah) this.purple;
                ahVar.crimson(new ap(22, hVar, ahVar));
                return "Deferred.asListenableFuture";
        }
    }

    @Override // androidx.camera.core.impl.aq
    public void bravo(ar arVar) {
        switch (this.alpha) {
            case 3:
                av avVar = (av) this.purple;
                synchronized (avVar.alpha) {
                    avVar.red++;
                }
                avVar.hotel(arVar);
                return;
            case 6:
                E e = (E) this.purple;
                e.getClass();
                try {
                    androidx.camera.core.ar foxtrot = arVar.foxtrot();
                    if (foxtrot != null) {
                        e.bravo.lima(foxtrot);
                        return;
                    }
                    return;
                } catch (IllegalStateException e4) {
                    AbstractC3066u3.charlie("ZslControlImpl", "Failed to acquire latest image IllegalStateException = " + e4.getMessage());
                    return;
                }
            default:
                ((w.o) this.purple).getClass();
                try {
                    androidx.camera.core.ar foxtrot2 = arVar.foxtrot();
                    if (foxtrot2 != null) {
                        j4.alpha();
                        AbstractC3066u3.india("CaptureNode", "Discarding ImageProxy which was inadvertently acquired: " + foxtrot2);
                        foxtrot2.close();
                        return;
                    }
                    return;
                } catch (IllegalStateException unused) {
                    return;
                }
        }
    }

    @Override // ah.a
    public void charlie(Object obj) {
        Uri uri;
        switch (this.alpha) {
            case 0:
                ActivityResult activityResult = (ActivityResult) obj;
                B9.ab this$0 = (B9.ab) this.purple;
                Intrinsics.echo(this$0, "this$0");
                int i4 = activityResult.alpha;
                CropImageActivity cropImageActivity = (CropImageActivity) ((O7.j) this$0.purple).purple;
                if (i4 == -1) {
                    Intent intent = activityResult.purple;
                    if (intent == null || (uri = intent.getData()) == null) {
                        uri = (Uri) this$0.silver;
                    }
                    if (uri == null) {
                        cropImageActivity.golf();
                        return;
                    }
                    cropImageActivity.alpha = uri;
                    CropImageView cropImageView = cropImageActivity.red;
                    if (cropImageView != null) {
                        cropImageView.setImageUriAsync(uri);
                        return;
                    }
                    return;
                }
                cropImageActivity.golf();
                return;
            default:
                ((Function1) ((ax) this.purple).getValue()).invoke(obj);
                return;
        }
    }

    @Override // com.google.gson.internal.n
    public Object delta() {
        Object obj = this.purple;
        switch (this.alpha) {
            case 22:
                Constructor constructor = (Constructor) obj;
                try {
                    return constructor.newInstance(null);
                } catch (IllegalAccessException e) {
                    AbstractC2726n7 abstractC2726n7 = R8.c.alpha;
                    throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.13.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
                } catch (InstantiationException e4) {
                    throw new RuntimeException("Failed to invoke constructor '" + R8.c.bravo(constructor) + "' with no args", e4);
                } catch (InvocationTargetException e5) {
                    throw new RuntimeException("Failed to invoke constructor '" + R8.c.bravo(constructor) + "' with no args", e5.getCause());
                }
            default:
                Class cls = (Class) obj;
                try {
                    return com.google.gson.internal.w.alpha.alpha(cls);
                } catch (Exception e10) {
                    throw new RuntimeException("Unable to create instance of " + cls + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e10);
                }
        }
    }

    @Override // G6.c
    public Object ivory(Task task) {
        Object obj;
        ((ao) this.purple).getClass();
        G6.q qVar = (G6.q) task;
        synchronized (qVar.alpha) {
            V5.x.juliet("Task is not yet complete", qVar.charlie);
            if (!qVar.delta) {
                if (!IOException.class.isInstance(qVar.foxtrot)) {
                    Exception exc = qVar.foxtrot;
                    if (exc == null) {
                        obj = qVar.echo;
                    } else {
                        throw new RuntimeExecutionException(exc);
                    }
                } else {
                    throw ((Throwable) IOException.class.cast(qVar.foxtrot));
                }
            } else {
                throw new CancellationException("Task is already canceled.");
            }
        }
        Bundle bundle = (Bundle) obj;
        if (bundle != null) {
            String string = bundle.getString("registration_id");
            if (string != null) {
                return string;
            }
            String string2 = bundle.getString("unregistered");
            if (string2 != null) {
                return string2;
            }
            String string3 = bundle.getString(RedirectCustomTabEventLogger.RESULT_ERROR);
            if (!"RST".equals(string3)) {
                if (string3 != null) {
                    throw new IOException(string3);
                }
                Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
                throw new IOException("SERVICE_NOT_AVAILABLE");
            }
            throw new IOException("INSTANCE_ID_RESET");
        }
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }

    @Override // G6.e
    public void onComplete(Task task) {
        switch (this.alpha) {
            case 15:
                PlayStoreReviewHandler.bravo((Function0) this.purple, task);
                return;
            case 19:
                com.google.firebase.messaging.x.bravo((Intent) this.purple);
                return;
            case 20:
                ((com.google.firebase.messaging.z) this.purple).bravo.delta(null);
                return;
            default:
                ((ScheduledFuture) this.purple).cancel(false);
                return;
        }
    }

    @Override // com.clevertap.android.sdk.task.OnFailureListener
    public void onFailure(Object obj) {
        CTInboxController.lambda$_markReadForMessagesWithIds$3((ArrayList) this.purple, (Exception) obj);
    }

    @Override // v2.j
    public void onRefresh() {
        TrophiesListFragment trophiesListFragment = (TrophiesListFragment) this.purple;
        trophiesListFragment.f12114f = 0;
        TrophiesListViewModel trophiesListViewModel = (TrophiesListViewModel) trophiesListFragment.f12111b.getValue();
        BaseViewModel.launchApi$default(trophiesListViewModel, null, new ka.h(trophiesListViewModel, trophiesListFragment.e, trophiesListFragment.f12114f, null), 1, null);
        trophiesListFragment.f12114f++;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener, com.clevertap.android.sdk.task.OnSuccessListener
    public void onSuccess(Object obj) {
        switch (this.alpha) {
            case 25:
                ((C1534h0) this.purple).invoke(obj);
                return;
            case 28:
                V2.b((QYW) this.purple, obj);
                return;
            default:
                ipc.b((br) this.purple, (JMS) obj);
                return;
        }
    }

    @Override // ar.a
    /* renamed from: apply, reason: collision with other method in class */
    public Object mo11apply(Object obj) {
        return (bo.e) ((bo.d) this.purple).invoke(obj);
    }
}
