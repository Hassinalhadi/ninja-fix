package io.getunleash.android;

import Cf.d;
import Nd.c;
import Pd.e;
import Pd.i;
import Xd.l;
import android.content.Context;
import io.getunleash.android.backup.LocalBackup;
import io.getunleash.android.backup.LocalStorageConfig;
import io.getunleash.android.cache.CacheDirectoryProvider;
import io.getunleash.android.cache.ObservableToggleCache;
import io.getunleash.android.data.UnleashContext;
import io.getunleash.android.data.UnleashState;
import io.getunleash.android.polling.UnleashFetcher;
import io.getunleash.android.util.UnleashLogger;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import vf.ab;
import vf.ad;
import vf.ao;
import yf.InterfaceC3440j;
import yf.N;
import yf.at;
import yf.av;
import yf.s;

@e(c = "io.getunleash.android.DefaultUnleash$initializeLocalBackup$1", f = "DefaultUnleash.kt", l = {208}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lvf/ab;", "", "<anonymous>", "(Lvf/ab;)V"}, k = 3, mv = {2, 2, 0})
/* loaded from: classes2.dex */
public final class DefaultUnleash$initializeLocalBackup$1 extends i implements l {
    int label;
    final /* synthetic */ DefaultUnleash this$0;

    @e(c = "io.getunleash.android.DefaultUnleash$initializeLocalBackup$1$1", f = "DefaultUnleash.kt", l = {215}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lvf/ab;", "", "<anonymous>", "(Lvf/ab;)V"}, k = 3, mv = {2, 2, 0})
    /* renamed from: io.getunleash.android.DefaultUnleash$initializeLocalBackup$1$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends i implements l {
        Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ DefaultUnleash this$0;

        @e(c = "io.getunleash.android.DefaultUnleash$initializeLocalBackup$1$1$1", f = "DefaultUnleash.kt", l = {}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lio/getunleash/android/data/UnleashContext;"}, k = 3, mv = {2, 2, 0}, xi = 48)
        /* renamed from: io.getunleash.android.DefaultUnleash$initializeLocalBackup$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C00091 extends i implements l {
            int label;
            final /* synthetic */ DefaultUnleash this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00091(DefaultUnleash defaultUnleash, c<? super C00091> cVar) {
                super(2, cVar);
                this.this$0 = defaultUnleash;
            }

            @Override // Pd.a
            public final c<Unit> create(Object obj, c<?> cVar) {
                return new C00091(this.this$0, cVar);
            }

            @Override // Xd.l
            public final Object invoke(UnleashContext unleashContext, c<? super Boolean> cVar) {
                return ((C00091) create(unleashContext, cVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // Pd.a
            public final Object invokeSuspend(Object obj) {
                AtomicBoolean atomicBoolean;
                Od.a aVar = Od.a.alpha;
                if (this.label == 0) {
                    ResultKt.alpha(obj);
                    atomicBoolean = this.this$0.ready;
                    return Boolean.valueOf(!atomicBoolean.get());
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(DefaultUnleash defaultUnleash, c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.this$0 = defaultUnleash;
        }

        @Override // Pd.a
        public final c<Unit> create(Object obj, c<?> cVar) {
            return new AnonymousClass1(this.this$0, cVar);
        }

        @Override // Pd.a
        public final Object invokeSuspend(Object obj) {
            UnleashConfig unleashConfig;
            Context context;
            Function1 function1;
            UnleashFetcher unleashFetcher;
            at atVar;
            Od.a aVar = Od.a.alpha;
            int i4 = this.label;
            if (i4 != 0) {
                if (i4 == 1) {
                    ResultKt.alpha(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.alpha(obj);
                unleashConfig = this.this$0.unleashConfig;
                LocalStorageConfig localStorageConfig = unleashConfig.getLocalStorageConfig();
                context = this.this$0.androidContext;
                File cacheDirectory$default = CacheDirectoryProvider.getCacheDirectory$default(new CacheDirectoryProvider(localStorageConfig, context, null, 4, null), DefaultUnleash.BACKUP_DIR_NAME, false, 2, null);
                function1 = this.this$0.localBackupFactory;
                final LocalBackup localBackup = (LocalBackup) function1.invoke(cacheDirectory$default);
                unleashFetcher = this.this$0.fetcher;
                localBackup.subscribeTo(unleashFetcher.getFeaturesReceivedFlow());
                atVar = this.this$0.unleashContextState;
                s sVar = new s(new av(atVar), new C00091(this.this$0, null), 2);
                final DefaultUnleash defaultUnleash = this.this$0;
                InterfaceC3440j interfaceC3440j = new InterfaceC3440j() { // from class: io.getunleash.android.DefaultUnleash.initializeLocalBackup.1.1.2
                    @Override // yf.InterfaceC3440j
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, c cVar) {
                        return emit((UnleashContext) obj2, (c<? super Unit>) cVar);
                    }

                    public final Object emit(UnleashContext unleashContext, c<? super Unit> cVar) {
                        at atVar2;
                        AtomicBoolean atomicBoolean;
                        ObservableToggleCache observableToggleCache;
                        UnleashLogger unleashLogger = UnleashLogger.INSTANCE;
                        UnleashLogger.d$default(unleashLogger, "Unleash", "Loading state from backup for " + unleashContext, null, 4, null);
                        LocalBackup localBackup2 = LocalBackup.this;
                        atVar2 = defaultUnleash.unleashContextState;
                        UnleashState loadFromDisc = localBackup2.loadFromDisc((UnleashContext) ((N) atVar2).getValue());
                        if (loadFromDisc != null) {
                            DefaultUnleash defaultUnleash2 = defaultUnleash;
                            atomicBoolean = defaultUnleash2.ready;
                            if (!atomicBoolean.get()) {
                                UnleashLogger.i$default(unleashLogger, "Unleash", "Loaded state from backup for " + unleashContext, null, 4, null);
                                observableToggleCache = defaultUnleash2.cache;
                                observableToggleCache.write(loadFromDisc);
                            } else {
                                UnleashLogger.d$default(unleashLogger, "Unleash", "Ignoring backup, Unleash is already ready", null, 4, null);
                            }
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
                if (sVar.collect(interfaceC3440j, this) == aVar) {
                    return aVar;
                }
            }
            return Unit.INSTANCE;
        }

        @Override // Xd.l
        public final Object invoke(ab abVar, c<? super Unit> cVar) {
            return ((AnonymousClass1) create(abVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultUnleash$initializeLocalBackup$1(DefaultUnleash defaultUnleash, c<? super DefaultUnleash$initializeLocalBackup$1> cVar) {
        super(2, cVar);
        this.this$0 = defaultUnleash;
    }

    @Override // Pd.a
    public final c<Unit> create(Object obj, c<?> cVar) {
        return new DefaultUnleash$initializeLocalBackup$1(this.this$0, cVar);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        int i4 = this.label;
        if (i4 != 0) {
            if (i4 == 1) {
                ResultKt.alpha(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.alpha(obj);
            Cf.e eVar = ao.alpha;
            d dVar = d.purple;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (ad.blue(dVar, anonymousClass1, this) == aVar) {
                return aVar;
            }
        }
        return Unit.INSTANCE;
    }

    @Override // Xd.l
    public final Object invoke(ab abVar, c<? super Unit> cVar) {
        return ((DefaultUnleash$initializeLocalBackup$1) create(abVar, cVar)).invokeSuspend(Unit.INSTANCE);
    }
}
