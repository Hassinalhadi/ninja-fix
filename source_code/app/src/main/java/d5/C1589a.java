package d5;

import androidx.compose.runtime.C0564b;
import com.checkout.address.ui.edit.ComposableSingletons$AddressEditScreenKt;
import com.checkout.address.ui.navigation.Screen;
import com.checkout.address.ui.state.ComposableSingletons$StatePickerFieldViewKt;
import com.checkout.address.ui.state.StatePickerViewModel;
import com.checkout.components.rememberme.model.RememberMeScreen;
import com.checkout.components.rememberme.model.SaveCardScreen;
import com.checkout.components.rememberme.utils.JWTTokenEncoder;
import com.checkout.components.rememberme.utils.PreviewFixtures;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.KSerializer;
import okhttp3.OkHttpClient;

/* renamed from: d5.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C1589a implements Function0 {
    public final /* synthetic */ int alpha;

    public /* synthetic */ C1589a(int i4) {
        this.alpha = i4;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        KSerializer a6;
        KSerializer a8;
        KSerializer a10;
        KSerializer a11;
        KSerializer a12;
        KSerializer a13;
        KSerializer a14;
        KSerializer a15;
        KSerializer b2;
        KSerializer a16;
        switch (this.alpha) {
            case 0:
                a6 = RememberMeScreen.GetToKnowUsDialog.a();
                return a6;
            case 1:
                a8 = RememberMeScreen.Wallet.a();
                return a8;
            case 2:
                a10 = SaveCardScreen.a();
                return a10;
            case 3:
                a11 = SaveCardScreen.CountryPicker.a();
                return a11;
            case 4:
                a12 = SaveCardScreen.GetToKnowUsDialog.a();
                return a12;
            case 5:
                a13 = SaveCardScreen.SaveCard.a();
                return a13;
            case 6:
                return C0564b.zulu(-1);
            case 7:
                return Unit.INSTANCE;
            case 8:
                return Unit.INSTANCE;
            case 9:
                return Unit.INSTANCE;
            case 10:
                return Unit.INSTANCE;
            case 11:
                return Unit.INSTANCE;
            case 12:
                return Unit.INSTANCE;
            case 13:
                return Unit.INSTANCE;
            case 14:
                return ComposableSingletons$AddressEditScreenKt.echo();
            case 15:
                return ComposableSingletons$AddressEditScreenKt.bravo();
            case 16:
                return ComposableSingletons$AddressEditScreenKt.foxtrot();
            case 17:
                a14 = Screen.a();
                return a14;
            case 18:
                a15 = Screen.AddressEdit.a();
                return a15;
            case 19:
                b2 = Screen.CountryPicker.b();
                return b2;
            case 20:
                a16 = Screen.StatePicker.a();
                return a16;
            case 21:
                return ComposableSingletons$StatePickerFieldViewKt.bravo();
            case 22:
                return StatePickerViewModel.alpha();
            case 23:
                return StatePickerViewModel.delta();
            case 24:
                return StatePickerViewModel.charlie();
            case 25:
                return JWTTokenEncoder.alpha();
            case 26:
                return PreviewFixtures.echo();
            case 27:
                return PreviewFixtures.bravo();
            case 28:
                return PreviewFixtures.alpha();
            default:
                return new OkHttpClient.Builder().build();
        }
    }
}
