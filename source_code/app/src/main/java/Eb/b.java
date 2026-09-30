package Eb;

import ae.o;
import androidx.appcompat.app.i;
import d3.k;
import delivery.samurai.android.ui.MainActivity;
import delivery.samurai.android.ui.agreement.Agreement;
import delivery.samurai.android.ui.areasV2.AreaListingActivityV2;
import delivery.samurai.android.ui.assets.AssetsDetailActivity;
import delivery.samurai.android.ui.assets.AssetsListActivity;
import delivery.samurai.android.ui.changePassword.ChangePasswordActivity;
import delivery.samurai.android.ui.chat.ChatActivity;
import delivery.samurai.android.ui.common.LocationInfoActivity;
import delivery.samurai.android.ui.deeplink.DeepLinkEntryActivity;
import delivery.samurai.android.ui.envelop.EnvelopDetailActivity;
import delivery.samurai.android.ui.envelop.EnvelopsListingActivity;
import delivery.samurai.android.ui.envelopV2.EnvelopDetailActivityV2;
import delivery.samurai.android.ui.envelopV2.EnvelopsListingActivityV2;
import delivery.samurai.android.ui.homev2.HomeActivityV2;
import delivery.samurai.android.ui.missingAttributes.AttributesMissingActivity;
import delivery.samurai.android.ui.onboarding.TutorialActivity;
import delivery.samurai.android.ui.orders.note.ui.AddressNoteActivity;
import delivery.samurai.android.ui.orders.note.ui.AllAddressNoteActivity;
import delivery.samurai.android.ui.orders.note.ui.CustomerCallAssistActivity;
import delivery.samurai.android.ui.orders.v2.ProcessOrderActivityV2;
import delivery.samurai.android.ui.resetPassword.ResetPasswordActivity;
import delivery.samurai.android.ui.splash.SplashActivity;
import delivery.samurai.android.ui.support.AddSupportTicketActivity;
import delivery.samurai.android.ui.support.ZenDeskChatActivity;
import delivery.samurai.android.ui.transfer.TransferCardListActivity;
import delivery.samurai.android.ui.withdraw.WalletTopUpActivity;
import delivery.samurai.android.ui.withdraw.WithdrawDetailActivity;
import delivery.samurai.android.ui.zones.ZonesActivity;
import fa.InterfaceC1701a;

/* loaded from: classes2.dex */
public final class b implements ag.b {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ i bravo;

    public /* synthetic */ b(i iVar, int i4) {
        this.alpha = i4;
        this.bravo = iVar;
    }

    @Override // ag.b
    public final void alpha(o oVar) {
        switch (this.alpha) {
            case 0:
                ((DeepLinkEntryActivity) this.bravo).foxtrot();
                return;
            case 1:
                ((EnvelopDetailActivity) this.bravo).foxtrot();
                return;
            case 2:
                ((EnvelopsListingActivity) this.bravo).foxtrot();
                return;
            case 3:
                ((SplashActivity) this.bravo).foxtrot();
                return;
            case 4:
                ((EnvelopDetailActivityV2) this.bravo).foxtrot();
                return;
            case 5:
                ((EnvelopsListingActivityV2) this.bravo).foxtrot();
                return;
            case 6:
                ((AddSupportTicketActivity) this.bravo).foxtrot();
                return;
            case 7:
                ((ZenDeskChatActivity) this.bravo).foxtrot();
                return;
            case 8:
                ((HomeActivityV2) this.bravo).foxtrot();
                return;
            case 9:
                ((AttributesMissingActivity) this.bravo).foxtrot();
                return;
            case 10:
                TutorialActivity tutorialActivity = (TutorialActivity) this.bravo;
                if (!tutorialActivity.silver) {
                    tutorialActivity.silver = true;
                    Pb.b bVar = (Pb.b) tutorialActivity.generatedComponent();
                    bVar.getClass();
                    return;
                }
                return;
            case 11:
                ((ChangePasswordActivity) this.bravo).foxtrot();
                return;
            case 12:
                ((TransferCardListActivity) this.bravo).foxtrot();
                return;
            case 13:
                ChatActivity chatActivity = (ChatActivity) this.bravo;
                if (!chatActivity.silver) {
                    chatActivity.silver = true;
                    Ta.b bVar2 = (Ta.b) chatActivity.generatedComponent();
                    bVar2.getClass();
                    return;
                }
                return;
            case 14:
                ((LocationInfoActivity) this.bravo).foxtrot();
                return;
            case 15:
                ((AddressNoteActivity) this.bravo).foxtrot();
                return;
            case 16:
                ((AllAddressNoteActivity) this.bravo).foxtrot();
                return;
            case 17:
                ((CustomerCallAssistActivity) this.bravo).foxtrot();
                return;
            case 18:
                ((WalletTopUpActivity) this.bravo).foxtrot();
                return;
            case 19:
                ((WithdrawDetailActivity) this.bravo).foxtrot();
                return;
            case 20:
                ((ZonesActivity) this.bravo).foxtrot();
                return;
            case 21:
                ((ProcessOrderActivityV2) this.bravo).foxtrot();
                return;
            case 22:
                i iVar = this.bravo;
                androidx.appcompat.app.o delegate = iVar.getDelegate();
                delegate.alpha();
                iVar.getSavedStateRegistry().alpha("androidx:appcompat");
                delegate.delta();
                return;
            case 23:
                ((k) this.bravo).foxtrot();
                return;
            case 24:
                MainActivity mainActivity = (MainActivity) this.bravo;
                if (!mainActivity.silver) {
                    mainActivity.silver = true;
                    InterfaceC1701a interfaceC1701a = (InterfaceC1701a) mainActivity.generatedComponent();
                    interfaceC1701a.getClass();
                    return;
                }
                return;
            case 25:
                ((Agreement) this.bravo).foxtrot();
                return;
            case 26:
                ((AreaListingActivityV2) this.bravo).foxtrot();
                return;
            case 27:
                ((AssetsDetailActivity) this.bravo).foxtrot();
                return;
            case 28:
                ((AssetsListActivity) this.bravo).foxtrot();
                return;
            default:
                ((ResetPasswordActivity) this.bravo).foxtrot();
                return;
        }
    }
}
