package com.checkout.components.wallet.di;

/* loaded from: classes3.dex */
public final class DaggerGooglePayComponent {

    /* loaded from: classes3.dex */
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        private GooglePayModule f6502a;

        public /* synthetic */ Builder(int i4) {
            this();
        }

        public final GooglePayComponent build() {
            if (this.f6502a == null) {
                this.f6502a = new GooglePayModule();
            }
            return new a(this.f6502a);
        }

        public final Builder googlePayModule(GooglePayModule googlePayModule) {
            googlePayModule.getClass();
            this.f6502a = googlePayModule;
            return this;
        }

        private Builder() {
        }
    }

    public static Builder builder() {
        return new Builder(0);
    }

    public static GooglePayComponent create() {
        return new Builder(0).build();
    }
}
