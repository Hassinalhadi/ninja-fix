package com.checkout.components.core.di.component;

import com.checkout.components.core.di.module.EnvironmentModule;
import com.checkout.components.core.di.module.FeatureGateModule;
import com.checkout.components.core.di.module.NetworkModule;
import com.checkout.components.core.di.module.RedirectHandlerModule;
import com.checkout.components.core.di.module.RememberMeModule;
import com.checkout.components.core.di.module.StyleMapperModule;
import com.checkout.components.core.di.module.UseCaseModule;
import s6.AbstractC2763s0;

/* loaded from: classes3.dex */
public final class DaggerCoreDIComponent {

    /* loaded from: classes3.dex */
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        private NetworkModule f4732a;

        /* renamed from: b, reason: collision with root package name */
        private UseCaseModule f4733b;

        /* renamed from: c, reason: collision with root package name */
        private StyleMapperModule f4734c;

        /* renamed from: d, reason: collision with root package name */
        private EnvironmentModule f4735d;
        private RememberMeModule e;

        /* renamed from: f, reason: collision with root package name */
        private FeatureGateModule f4736f;

        /* renamed from: g, reason: collision with root package name */
        private RedirectHandlerModule f4737g;

        public /* synthetic */ Builder(int i4) {
            this();
        }

        public final CoreDIComponent build() {
            if (this.f4732a == null) {
                this.f4732a = new NetworkModule();
            }
            if (this.f4733b == null) {
                this.f4733b = new UseCaseModule();
            }
            if (this.f4734c == null) {
                this.f4734c = new StyleMapperModule();
            }
            AbstractC2763s0.bravo(EnvironmentModule.class, this.f4735d);
            AbstractC2763s0.bravo(RememberMeModule.class, this.e);
            if (this.f4736f == null) {
                this.f4736f = new FeatureGateModule();
            }
            if (this.f4737g == null) {
                this.f4737g = new RedirectHandlerModule();
            }
            return new a(this.f4732a, this.f4733b, this.f4734c, this.f4735d, this.e, this.f4736f, this.f4737g);
        }

        public final Builder environmentModule(EnvironmentModule environmentModule) {
            environmentModule.getClass();
            this.f4735d = environmentModule;
            return this;
        }

        public final Builder featureGateModule(FeatureGateModule featureGateModule) {
            featureGateModule.getClass();
            this.f4736f = featureGateModule;
            return this;
        }

        public final Builder networkModule(NetworkModule networkModule) {
            networkModule.getClass();
            this.f4732a = networkModule;
            return this;
        }

        public final Builder redirectHandlerModule(RedirectHandlerModule redirectHandlerModule) {
            redirectHandlerModule.getClass();
            this.f4737g = redirectHandlerModule;
            return this;
        }

        public final Builder rememberMeModule(RememberMeModule rememberMeModule) {
            rememberMeModule.getClass();
            this.e = rememberMeModule;
            return this;
        }

        public final Builder styleMapperModule(StyleMapperModule styleMapperModule) {
            styleMapperModule.getClass();
            this.f4734c = styleMapperModule;
            return this;
        }

        public final Builder useCaseModule(UseCaseModule useCaseModule) {
            useCaseModule.getClass();
            this.f4733b = useCaseModule;
            return this;
        }

        private Builder() {
        }
    }

    public static Builder builder() {
        return new Builder(0);
    }
}
