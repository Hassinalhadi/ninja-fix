package com.checkout.components.kmp.rememberme.data.repositories;

import Nd.c;
import Od.a;
import androidx.recyclerview.widget.RecyclerView;
import com.checkout.components.kmp.rememberme.data.model.CreateChallengeRequest;
import com.checkout.components.kmp.rememberme.data.model.CreateChallengeResponse;
import com.checkout.components.kmp.rememberme.data.model.CreateHintRequest;
import com.checkout.components.kmp.rememberme.data.model.CreateHintResponse;
import com.checkout.components.kmp.rememberme.data.model.RequestResult;
import com.checkout.components.kmp.rememberme.data.model.RespondChallengeRequest;
import com.checkout.components.kmp.rememberme.data.model.RespondChallengeResponse;
import com.checkout.components.kmp.rememberme.data.remote.NetworkClient;
import com.checkout.components.kmp.rememberme.data.remote.NetworkClient$request$response$1$1;
import com.checkout.components.kmp.rememberme.data.remote.NetworkClient$request$response$1$2;
import com.checkout.components.kmp.rememberme.shared.model.RememberMeEnvironment;
import com.checkout.components.kmp.rememberme.utils.Configurations;
import com.checkout.components.kmp.rememberme.utils.ExtensionsKt;
import dd.C1614e;
import ge.InterfaceC1772d;
import ge.w;
import io.ktor.client.plugins.ResponseException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import od.AbstractC2228e;
import od.C2226c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pd.AbstractC2304b;
import sd.aa;
import sd.b;
import sd.s;
import t6.AbstractC2991f2;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J&\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\n2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0014H\u0096@¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/checkout/components/kmp/rememberme/data/repositories/ConsumerRepositoryImpl;", "Lcom/checkout/components/kmp/rememberme/data/repositories/ConsumerRepository;", "Lcom/checkout/components/kmp/rememberme/data/remote/NetworkClient;", "networkClient", "Lcom/checkout/components/kmp/rememberme/shared/model/RememberMeEnvironment;", "environment", "<init>", "(Lcom/checkout/components/kmp/rememberme/data/remote/NetworkClient;Lcom/checkout/components/kmp/rememberme/shared/model/RememberMeEnvironment;)V", "", "email", "Lcom/checkout/components/kmp/rememberme/data/model/RequestResult;", "Lcom/checkout/components/kmp/rememberme/data/model/CreateHintResponse;", "createHint", "(Ljava/lang/String;LNd/c;)Ljava/lang/Object;", "Lcom/checkout/components/kmp/rememberme/data/model/CreateChallengeRequest;", "request", "Lcom/checkout/components/kmp/rememberme/data/model/CreateChallengeResponse;", "createChallenge", "(Lcom/checkout/components/kmp/rememberme/data/model/CreateChallengeRequest;LNd/c;)Ljava/lang/Object;", "challengeId", "Lcom/checkout/components/kmp/rememberme/data/model/RespondChallengeRequest;", "Lcom/checkout/components/kmp/rememberme/data/model/RespondChallengeResponse;", "respondChallenge", "(Ljava/lang/String;Lcom/checkout/components/kmp/rememberme/data/model/RespondChallengeRequest;LNd/c;)Ljava/lang/Object;", "Lcom/checkout/components/kmp/rememberme/data/remote/NetworkClient;", "baseUrl", "Ljava/lang/String;", "rememberme_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ConsumerRepositoryImpl implements ConsumerRepository {
    public static final int $stable = 8;

    @NotNull
    private final String baseUrl;

    @NotNull
    private final NetworkClient networkClient;

    public ConsumerRepositoryImpl(@NotNull NetworkClient networkClient, @NotNull RememberMeEnvironment environment) {
        Intrinsics.echo(networkClient, "networkClient");
        Intrinsics.echo(environment, "environment");
        this.networkClient = networkClient;
        this.baseUrl = ExtensionsKt.toConsumerApiBaseUrl(environment);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:(2:3|(8:5|6|7|(1:(1:(3:11|12|(2:14|15)(2:17|18))(2:19|20))(2:21|22))(6:31|32|33|(4:35|36|37|38)(4:45|46|47|48)|39|(2:41|28)(1:42))|23|24|25|26))|7|(0)(0)|23|24|25|26) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0147, code lost:
    
        if (r15 != r2) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0125, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    @Override // com.checkout.components.kmp.rememberme.data.repositories.ConsumerRepository
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object createChallenge(@NotNull CreateChallengeRequest createChallengeRequest, @NotNull c<? super RequestResult<CreateChallengeResponse>> cVar) {
        ConsumerRepositoryImpl$createChallenge$1 consumerRepositoryImpl$createChallenge$1;
        int i4;
        w wVar;
        int i5;
        w wVar2;
        try {
            if (cVar instanceof ConsumerRepositoryImpl$createChallenge$1) {
                consumerRepositoryImpl$createChallenge$1 = (ConsumerRepositoryImpl$createChallenge$1) cVar;
                int i10 = consumerRepositoryImpl$createChallenge$1.label;
                if ((i10 & RecyclerView.UNDEFINED_DURATION) != 0) {
                    consumerRepositoryImpl$createChallenge$1.label = i10 - RecyclerView.UNDEFINED_DURATION;
                    Object obj = consumerRepositoryImpl$createChallenge$1.result;
                    a aVar = a.alpha;
                    i4 = consumerRepositoryImpl$createChallenge$1.label;
                    if (i4 == 0) {
                        if (i4 != 1) {
                            if (i4 == 2) {
                                ResultKt.alpha(obj);
                                if (obj != null) {
                                    return new RequestResult.Success((CreateChallengeResponse) obj);
                                }
                                throw new NullPointerException("null cannot be cast to non-null type com.checkout.components.kmp.rememberme.data.model.CreateChallengeResponse");
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        i5 = consumerRepositoryImpl$createChallenge$1.I$0;
                        ResultKt.alpha(obj);
                    } else {
                        ResultKt.alpha(obj);
                        NetworkClient networkClient = this.networkClient;
                        String str = this.baseUrl;
                        s sVar = s.charlie;
                        cd.c client = networkClient.getClient();
                        C2226c c2226c = new C2226c();
                        Intrinsics.echo(sVar, "<set-?>");
                        c2226c.bravo = sVar;
                        AbstractC2228e.alpha(c2226c, new NetworkClient$request$response$1$1(networkClient));
                        NetworkClient$request$response$1$2 networkClient$request$response$1$2 = new NetworkClient$request$response$1$2(str, Configurations.CONSUMER_API_CREATE_CHALLENGE_PATH);
                        aa aaVar = c2226c.alpha;
                        networkClient$request$response$1$2.invoke((Object) aaVar, (Object) aaVar);
                        AbstractC2991f2.delta(c2226c, b.alpha);
                        if (createChallengeRequest == null) {
                            c2226c.delta = vd.b.alpha;
                            InterfaceC1772d bravo = u.alpha.bravo(CreateChallengeRequest.class);
                            try {
                                wVar2 = u.alpha(CreateChallengeRequest.class);
                            } catch (Throwable unused) {
                                wVar2 = null;
                            }
                            c2226c.alpha(new Ed.a(bravo, wVar2));
                        } else {
                            c2226c.delta = createChallengeRequest;
                            InterfaceC1772d bravo2 = u.alpha.bravo(CreateChallengeRequest.class);
                            try {
                                wVar = u.alpha(CreateChallengeRequest.class);
                            } catch (Throwable unused2) {
                                wVar = null;
                            }
                            c2226c.alpha(new Ed.a(bravo2, wVar));
                        }
                        com.google.android.play.core.integrity.c cVar2 = new com.google.android.play.core.integrity.c(c2226c, client);
                        consumerRepositoryImpl$createChallenge$1.L$0 = null;
                        consumerRepositoryImpl$createChallenge$1.L$1 = null;
                        consumerRepositoryImpl$createChallenge$1.L$2 = null;
                        consumerRepositoryImpl$createChallenge$1.L$3 = null;
                        consumerRepositoryImpl$createChallenge$1.L$4 = null;
                        consumerRepositoryImpl$createChallenge$1.L$5 = null;
                        consumerRepositoryImpl$createChallenge$1.L$6 = null;
                        consumerRepositoryImpl$createChallenge$1.L$7 = null;
                        consumerRepositoryImpl$createChallenge$1.L$8 = null;
                        consumerRepositoryImpl$createChallenge$1.I$0 = 0;
                        consumerRepositoryImpl$createChallenge$1.I$1 = 0;
                        consumerRepositoryImpl$createChallenge$1.I$2 = 0;
                        consumerRepositoryImpl$createChallenge$1.label = 1;
                        obj = cVar2.delta(consumerRepositoryImpl$createChallenge$1);
                        if (obj != aVar) {
                            i5 = 0;
                        } else {
                            return aVar;
                        }
                    }
                    C1614e bravo3 = ((AbstractC2304b) obj).bravo();
                    InterfaceC1772d bravo4 = u.alpha.bravo(CreateChallengeResponse.class);
                    w wVar3 = u.alpha(CreateChallengeResponse.class);
                    Ed.a aVar2 = new Ed.a(bravo4, wVar3);
                    consumerRepositoryImpl$createChallenge$1.L$0 = null;
                    consumerRepositoryImpl$createChallenge$1.L$1 = null;
                    consumerRepositoryImpl$createChallenge$1.L$2 = null;
                    consumerRepositoryImpl$createChallenge$1.L$3 = null;
                    consumerRepositoryImpl$createChallenge$1.L$4 = null;
                    consumerRepositoryImpl$createChallenge$1.L$5 = null;
                    consumerRepositoryImpl$createChallenge$1.L$6 = null;
                    consumerRepositoryImpl$createChallenge$1.L$7 = null;
                    consumerRepositoryImpl$createChallenge$1.L$8 = null;
                    consumerRepositoryImpl$createChallenge$1.I$0 = i5;
                    consumerRepositoryImpl$createChallenge$1.I$1 = 0;
                    consumerRepositoryImpl$createChallenge$1.label = 2;
                    obj = bravo3.alpha(aVar2, consumerRepositoryImpl$createChallenge$1);
                }
            }
            if (i4 == 0) {
            }
            C1614e bravo32 = ((AbstractC2304b) obj).bravo();
            InterfaceC1772d bravo42 = u.alpha.bravo(CreateChallengeResponse.class);
            w wVar32 = u.alpha(CreateChallengeResponse.class);
            Ed.a aVar22 = new Ed.a(bravo42, wVar32);
            consumerRepositoryImpl$createChallenge$1.L$0 = null;
            consumerRepositoryImpl$createChallenge$1.L$1 = null;
            consumerRepositoryImpl$createChallenge$1.L$2 = null;
            consumerRepositoryImpl$createChallenge$1.L$3 = null;
            consumerRepositoryImpl$createChallenge$1.L$4 = null;
            consumerRepositoryImpl$createChallenge$1.L$5 = null;
            consumerRepositoryImpl$createChallenge$1.L$6 = null;
            consumerRepositoryImpl$createChallenge$1.L$7 = null;
            consumerRepositoryImpl$createChallenge$1.L$8 = null;
            consumerRepositoryImpl$createChallenge$1.I$0 = i5;
            consumerRepositoryImpl$createChallenge$1.I$1 = 0;
            consumerRepositoryImpl$createChallenge$1.label = 2;
            obj = bravo32.alpha(aVar22, consumerRepositoryImpl$createChallenge$1);
        } catch (ResponseException e) {
            return new RequestResult.Failed(e.getResponse().golf(), e);
        } catch (Exception e4) {
            return new RequestResult.Failed(null, e4);
        }
        consumerRepositoryImpl$createChallenge$1 = new ConsumerRepositoryImpl$createChallenge$1(this, cVar);
        Object obj2 = consumerRepositoryImpl$createChallenge$1.result;
        a aVar3 = a.alpha;
        i4 = consumerRepositoryImpl$createChallenge$1.label;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:(2:3|(8:5|6|7|(1:(1:(3:11|12|(2:14|15)(2:17|18))(2:19|20))(2:21|22))(6:31|32|33|34|35|(2:37|28)(1:38))|23|24|25|26))|7|(0)(0)|23|24|25|26) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x013a, code lost:
    
        if (r0 != r5) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0117, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    @Override // com.checkout.components.kmp.rememberme.data.repositories.ConsumerRepository
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object createHint(@NotNull String str, @NotNull c<? super RequestResult<CreateHintResponse>> cVar) {
        ConsumerRepositoryImpl$createHint$1 consumerRepositoryImpl$createHint$1;
        int i4;
        w wVar;
        int i5;
        try {
            if (cVar instanceof ConsumerRepositoryImpl$createHint$1) {
                consumerRepositoryImpl$createHint$1 = (ConsumerRepositoryImpl$createHint$1) cVar;
                int i10 = consumerRepositoryImpl$createHint$1.label;
                if ((i10 & RecyclerView.UNDEFINED_DURATION) != 0) {
                    consumerRepositoryImpl$createHint$1.label = i10 - RecyclerView.UNDEFINED_DURATION;
                    Object obj = consumerRepositoryImpl$createHint$1.result;
                    a aVar = a.alpha;
                    i4 = consumerRepositoryImpl$createHint$1.label;
                    if (i4 == 0) {
                        if (i4 != 1) {
                            if (i4 == 2) {
                                ResultKt.alpha(obj);
                                if (obj != null) {
                                    return new RequestResult.Success((CreateHintResponse) obj);
                                }
                                throw new NullPointerException("null cannot be cast to non-null type com.checkout.components.kmp.rememberme.data.model.CreateHintResponse");
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        i5 = consumerRepositoryImpl$createHint$1.I$0;
                        ResultKt.alpha(obj);
                    } else {
                        ResultKt.alpha(obj);
                        NetworkClient networkClient = this.networkClient;
                        String str2 = this.baseUrl;
                        s sVar = s.charlie;
                        CreateHintRequest createHintRequest = new CreateHintRequest("email", str);
                        cd.c client = networkClient.getClient();
                        C2226c c2226c = new C2226c();
                        Intrinsics.echo(sVar, "<set-?>");
                        c2226c.bravo = sVar;
                        AbstractC2228e.alpha(c2226c, new NetworkClient$request$response$1$1(networkClient));
                        NetworkClient$request$response$1$2 networkClient$request$response$1$2 = new NetworkClient$request$response$1$2(str2, Configurations.CONSUMER_API_GET_HINT_PATH);
                        aa aaVar = c2226c.alpha;
                        networkClient$request$response$1$2.invoke((Object) aaVar, (Object) aaVar);
                        AbstractC2991f2.delta(c2226c, b.alpha);
                        c2226c.delta = createHintRequest;
                        InterfaceC1772d bravo = u.alpha.bravo(CreateHintRequest.class);
                        try {
                            wVar = u.alpha(CreateHintRequest.class);
                        } catch (Throwable unused) {
                            wVar = null;
                        }
                        c2226c.alpha(new Ed.a(bravo, wVar));
                        com.google.android.play.core.integrity.c cVar2 = new com.google.android.play.core.integrity.c(c2226c, client);
                        consumerRepositoryImpl$createHint$1.L$0 = null;
                        consumerRepositoryImpl$createHint$1.L$1 = null;
                        consumerRepositoryImpl$createHint$1.L$2 = null;
                        consumerRepositoryImpl$createHint$1.L$3 = null;
                        consumerRepositoryImpl$createHint$1.L$4 = null;
                        consumerRepositoryImpl$createHint$1.L$5 = null;
                        consumerRepositoryImpl$createHint$1.L$6 = null;
                        consumerRepositoryImpl$createHint$1.L$7 = null;
                        consumerRepositoryImpl$createHint$1.L$8 = null;
                        consumerRepositoryImpl$createHint$1.I$0 = 0;
                        consumerRepositoryImpl$createHint$1.I$1 = 0;
                        consumerRepositoryImpl$createHint$1.I$2 = 0;
                        consumerRepositoryImpl$createHint$1.label = 1;
                        obj = cVar2.delta(consumerRepositoryImpl$createHint$1);
                        if (obj != aVar) {
                            i5 = 0;
                        } else {
                            return aVar;
                        }
                    }
                    C1614e bravo2 = ((AbstractC2304b) obj).bravo();
                    InterfaceC1772d bravo3 = u.alpha.bravo(CreateHintResponse.class);
                    w wVar2 = u.alpha(CreateHintResponse.class);
                    Ed.a aVar2 = new Ed.a(bravo3, wVar2);
                    consumerRepositoryImpl$createHint$1.L$0 = null;
                    consumerRepositoryImpl$createHint$1.L$1 = null;
                    consumerRepositoryImpl$createHint$1.L$2 = null;
                    consumerRepositoryImpl$createHint$1.L$3 = null;
                    consumerRepositoryImpl$createHint$1.L$4 = null;
                    consumerRepositoryImpl$createHint$1.L$5 = null;
                    consumerRepositoryImpl$createHint$1.L$6 = null;
                    consumerRepositoryImpl$createHint$1.L$7 = null;
                    consumerRepositoryImpl$createHint$1.L$8 = null;
                    consumerRepositoryImpl$createHint$1.I$0 = i5;
                    consumerRepositoryImpl$createHint$1.I$1 = 0;
                    consumerRepositoryImpl$createHint$1.label = 2;
                    obj = bravo2.alpha(aVar2, consumerRepositoryImpl$createHint$1);
                }
            }
            if (i4 == 0) {
            }
            C1614e bravo22 = ((AbstractC2304b) obj).bravo();
            InterfaceC1772d bravo32 = u.alpha.bravo(CreateHintResponse.class);
            w wVar22 = u.alpha(CreateHintResponse.class);
            Ed.a aVar22 = new Ed.a(bravo32, wVar22);
            consumerRepositoryImpl$createHint$1.L$0 = null;
            consumerRepositoryImpl$createHint$1.L$1 = null;
            consumerRepositoryImpl$createHint$1.L$2 = null;
            consumerRepositoryImpl$createHint$1.L$3 = null;
            consumerRepositoryImpl$createHint$1.L$4 = null;
            consumerRepositoryImpl$createHint$1.L$5 = null;
            consumerRepositoryImpl$createHint$1.L$6 = null;
            consumerRepositoryImpl$createHint$1.L$7 = null;
            consumerRepositoryImpl$createHint$1.L$8 = null;
            consumerRepositoryImpl$createHint$1.I$0 = i5;
            consumerRepositoryImpl$createHint$1.I$1 = 0;
            consumerRepositoryImpl$createHint$1.label = 2;
            obj = bravo22.alpha(aVar22, consumerRepositoryImpl$createHint$1);
        } catch (ResponseException e) {
            return new RequestResult.Failed(e.getResponse().golf(), e);
        } catch (Exception e4) {
            return new RequestResult.Failed(null, e4);
        }
        consumerRepositoryImpl$createHint$1 = new ConsumerRepositoryImpl$createHint$1(this, cVar);
        Object obj2 = consumerRepositoryImpl$createHint$1.result;
        a aVar3 = a.alpha;
        i4 = consumerRepositoryImpl$createHint$1.label;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:(2:3|(8:5|6|7|(1:(1:(3:11|12|(2:14|15)(2:17|18))(2:19|20))(2:21|22))(6:31|32|33|(4:35|36|37|38)(4:45|46|47|48)|39|(2:41|28)(1:42))|23|24|25|26))|7|(0)(0)|23|24|25|26) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0157, code lost:
    
        if (r15 != r2) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0133, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    @Override // com.checkout.components.kmp.rememberme.data.repositories.ConsumerRepository
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object respondChallenge(@NotNull String str, @NotNull RespondChallengeRequest respondChallengeRequest, @NotNull c<? super RequestResult<RespondChallengeResponse>> cVar) {
        ConsumerRepositoryImpl$respondChallenge$1 consumerRepositoryImpl$respondChallenge$1;
        int i4;
        w wVar;
        int i5;
        w wVar2;
        try {
            if (cVar instanceof ConsumerRepositoryImpl$respondChallenge$1) {
                consumerRepositoryImpl$respondChallenge$1 = (ConsumerRepositoryImpl$respondChallenge$1) cVar;
                int i10 = consumerRepositoryImpl$respondChallenge$1.label;
                if ((i10 & RecyclerView.UNDEFINED_DURATION) != 0) {
                    consumerRepositoryImpl$respondChallenge$1.label = i10 - RecyclerView.UNDEFINED_DURATION;
                    Object obj = consumerRepositoryImpl$respondChallenge$1.result;
                    a aVar = a.alpha;
                    i4 = consumerRepositoryImpl$respondChallenge$1.label;
                    if (i4 == 0) {
                        if (i4 != 1) {
                            if (i4 == 2) {
                                ResultKt.alpha(obj);
                                if (obj != null) {
                                    return new RequestResult.Success((RespondChallengeResponse) obj);
                                }
                                throw new NullPointerException("null cannot be cast to non-null type com.checkout.components.kmp.rememberme.data.model.RespondChallengeResponse");
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        i5 = consumerRepositoryImpl$respondChallenge$1.I$0;
                        ResultKt.alpha(obj);
                    } else {
                        ResultKt.alpha(obj);
                        NetworkClient networkClient = this.networkClient;
                        String str2 = this.baseUrl;
                        String respondChallengePath = Configurations.INSTANCE.respondChallengePath(str);
                        s sVar = s.charlie;
                        cd.c client = networkClient.getClient();
                        C2226c c2226c = new C2226c();
                        Intrinsics.echo(sVar, "<set-?>");
                        c2226c.bravo = sVar;
                        AbstractC2228e.alpha(c2226c, new NetworkClient$request$response$1$1(networkClient));
                        NetworkClient$request$response$1$2 networkClient$request$response$1$2 = new NetworkClient$request$response$1$2(str2, respondChallengePath);
                        aa aaVar = c2226c.alpha;
                        networkClient$request$response$1$2.invoke((Object) aaVar, (Object) aaVar);
                        AbstractC2991f2.delta(c2226c, b.alpha);
                        if (respondChallengeRequest == null) {
                            c2226c.delta = vd.b.alpha;
                            InterfaceC1772d bravo = u.alpha.bravo(RespondChallengeRequest.class);
                            try {
                                wVar2 = u.alpha(RespondChallengeRequest.class);
                            } catch (Throwable unused) {
                                wVar2 = null;
                            }
                            c2226c.alpha(new Ed.a(bravo, wVar2));
                        } else {
                            c2226c.delta = respondChallengeRequest;
                            InterfaceC1772d bravo2 = u.alpha.bravo(RespondChallengeRequest.class);
                            try {
                                wVar = u.alpha(RespondChallengeRequest.class);
                            } catch (Throwable unused2) {
                                wVar = null;
                            }
                            c2226c.alpha(new Ed.a(bravo2, wVar));
                        }
                        com.google.android.play.core.integrity.c cVar2 = new com.google.android.play.core.integrity.c(c2226c, client);
                        consumerRepositoryImpl$respondChallenge$1.L$0 = null;
                        consumerRepositoryImpl$respondChallenge$1.L$1 = null;
                        consumerRepositoryImpl$respondChallenge$1.L$2 = null;
                        consumerRepositoryImpl$respondChallenge$1.L$3 = null;
                        consumerRepositoryImpl$respondChallenge$1.L$4 = null;
                        consumerRepositoryImpl$respondChallenge$1.L$5 = null;
                        consumerRepositoryImpl$respondChallenge$1.L$6 = null;
                        consumerRepositoryImpl$respondChallenge$1.L$7 = null;
                        consumerRepositoryImpl$respondChallenge$1.L$8 = null;
                        consumerRepositoryImpl$respondChallenge$1.L$9 = null;
                        consumerRepositoryImpl$respondChallenge$1.I$0 = 0;
                        consumerRepositoryImpl$respondChallenge$1.I$1 = 0;
                        consumerRepositoryImpl$respondChallenge$1.I$2 = 0;
                        consumerRepositoryImpl$respondChallenge$1.label = 1;
                        obj = cVar2.delta(consumerRepositoryImpl$respondChallenge$1);
                        if (obj != aVar) {
                            i5 = 0;
                        } else {
                            return aVar;
                        }
                    }
                    C1614e bravo3 = ((AbstractC2304b) obj).bravo();
                    InterfaceC1772d bravo4 = u.alpha.bravo(RespondChallengeResponse.class);
                    w wVar3 = u.alpha(RespondChallengeResponse.class);
                    Ed.a aVar2 = new Ed.a(bravo4, wVar3);
                    consumerRepositoryImpl$respondChallenge$1.L$0 = null;
                    consumerRepositoryImpl$respondChallenge$1.L$1 = null;
                    consumerRepositoryImpl$respondChallenge$1.L$2 = null;
                    consumerRepositoryImpl$respondChallenge$1.L$3 = null;
                    consumerRepositoryImpl$respondChallenge$1.L$4 = null;
                    consumerRepositoryImpl$respondChallenge$1.L$5 = null;
                    consumerRepositoryImpl$respondChallenge$1.L$6 = null;
                    consumerRepositoryImpl$respondChallenge$1.L$7 = null;
                    consumerRepositoryImpl$respondChallenge$1.L$8 = null;
                    consumerRepositoryImpl$respondChallenge$1.L$9 = null;
                    consumerRepositoryImpl$respondChallenge$1.I$0 = i5;
                    consumerRepositoryImpl$respondChallenge$1.I$1 = 0;
                    consumerRepositoryImpl$respondChallenge$1.label = 2;
                    obj = bravo3.alpha(aVar2, consumerRepositoryImpl$respondChallenge$1);
                }
            }
            if (i4 == 0) {
            }
            C1614e bravo32 = ((AbstractC2304b) obj).bravo();
            InterfaceC1772d bravo42 = u.alpha.bravo(RespondChallengeResponse.class);
            w wVar32 = u.alpha(RespondChallengeResponse.class);
            Ed.a aVar22 = new Ed.a(bravo42, wVar32);
            consumerRepositoryImpl$respondChallenge$1.L$0 = null;
            consumerRepositoryImpl$respondChallenge$1.L$1 = null;
            consumerRepositoryImpl$respondChallenge$1.L$2 = null;
            consumerRepositoryImpl$respondChallenge$1.L$3 = null;
            consumerRepositoryImpl$respondChallenge$1.L$4 = null;
            consumerRepositoryImpl$respondChallenge$1.L$5 = null;
            consumerRepositoryImpl$respondChallenge$1.L$6 = null;
            consumerRepositoryImpl$respondChallenge$1.L$7 = null;
            consumerRepositoryImpl$respondChallenge$1.L$8 = null;
            consumerRepositoryImpl$respondChallenge$1.L$9 = null;
            consumerRepositoryImpl$respondChallenge$1.I$0 = i5;
            consumerRepositoryImpl$respondChallenge$1.I$1 = 0;
            consumerRepositoryImpl$respondChallenge$1.label = 2;
            obj = bravo32.alpha(aVar22, consumerRepositoryImpl$respondChallenge$1);
        } catch (ResponseException e) {
            return new RequestResult.Failed(e.getResponse().golf(), e);
        } catch (Exception e4) {
            return new RequestResult.Failed(null, e4);
        }
        consumerRepositoryImpl$respondChallenge$1 = new ConsumerRepositoryImpl$respondChallenge$1(this, cVar);
        Object obj2 = consumerRepositoryImpl$respondChallenge$1.result;
        a aVar3 = a.alpha;
        i4 = consumerRepositoryImpl$respondChallenge$1.label;
    }
}
