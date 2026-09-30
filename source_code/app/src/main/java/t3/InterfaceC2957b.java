package t3;

import com.app.network.network.models.ActiveSuspension;
import com.app.network.network.models.AddressNoteListItem;
import com.app.network.network.models.AppAgreementSignatureOwnerTypeEnum;
import com.app.network.network.models.AppAgreementTypeEnum;
import com.app.network.network.models.CaptainClaimUnsettled;
import com.app.network.network.models.CaptainProfileAttributeOtpResponse;
import com.app.network.network.models.CaptainQrResponse;
import com.app.network.network.models.EnvelopNotification;
import com.app.network.network.models.FintechAccount;
import com.app.network.network.models.NaqlBlockedReason;
import com.app.network.network.models.OtpVerificationRequest;
import com.app.network.network.models.ProfileAttributesRequest;
import com.app.network.network.models.ReferralResponse;
import com.app.network.network.models.Score;
import com.app.network.network.models.SignedAppAgreement;
import com.app.network.network.models.SuspensionHistoryItem;
import com.app.network.network.models.Transaction;
import com.app.network.network.models.TransferCard;
import com.app.network.network.models.UrPayUpdateRequest;
import com.app.network.network.models.VerifyDeviceRequest;
import com.app.network.network.models.Wallet;
import com.app.network.network.models.WalletSettlementResponse;
import com.app.network.network.models.WalletTopUpResponse;
import com.app.network.network.models.WithdrawTransaction;
import com.app.network.network.models.agreement.AppAgreement;
import com.app.network.network.models.agreement.SignAppAgreementRequest;
import com.app.network.network.models.captian.Assets;
import com.app.network.network.models.captian.ReturnAssetRequest;
import com.app.network.network.models.points.PointingRuleResponse;
import com.app.network.network.models.points.PointsTransactionResponse;
import com.app.network.network.models.points.PointsVaultResponse;
import com.app.network.network.models.points.redeem.PointRewardResponse;
import com.app.network.network.models.trophies.Trophy;
import com.app.network.network.models.trophies.TrophyMilestone;
import com.app.network.network.response.DataResponse;
import com.clevertap.android.sdk.Constants;
import io.reactivex.Completable;
import io.reactivex.Single;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import vg.aq;
import yg.l;
import yg.n;
import yg.o;
import yg.q;
import yg.s;
import yg.t;

@Metadata(d1 = {"\u0000Ð\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00042\b\b\u0001\u0010\t\u001a\u00020\bH'¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0004H'¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0014\u001a\u00020\u00132\b\b\u0001\u0010\u0012\u001a\u00020\u0011H'¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\n0\u00042\b\b\u0003\u0010\t\u001a\u00020\bH'¢\u0006\u0004\b\u0017\u0010\rJ/\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\n0\u00042\b\b\u0003\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0018\u001a\u00020\u0002H'¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00160\u00042\b\b\u0001\u0010\u001b\u001a\u00020\u0002H'¢\u0006\u0004\b\u001c\u0010\u0007J\u0019\u0010\u001e\u001a\u00020\u00132\b\b\u0001\u0010\u001d\u001a\u00020\u0002H'¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u0004H'¢\u0006\u0004\b!\u0010\u0010J%\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\n0\u00042\b\b\u0001\u0010\"\u001a\u00020\bH'¢\u0006\u0004\b$\u0010\rJ'\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\n0\u00042\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\bH'¢\u0006\u0004\b&\u0010'J\u001f\u0010(\u001a\b\u0012\u0004\u0012\u00020%0\u00042\b\b\u0001\u0010\u001b\u001a\u00020\bH'¢\u0006\u0004\b(\u0010\rJ\u001f\u0010)\u001a\b\u0012\u0004\u0012\u00020%0\u00042\b\b\u0001\u0010\u001b\u001a\u00020\bH'¢\u0006\u0004\b)\u0010\rJ\u0015\u0010+\u001a\b\u0012\u0004\u0012\u00020*0\u0004H'¢\u0006\u0004\b+\u0010\u0010J\u001b\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0,0\u0004H'¢\u0006\u0004\b.\u0010\u0010J\u001b\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0,0\u0004H'¢\u0006\u0004\b0\u0010\u0010J\u001f\u00103\u001a\b\u0012\u0004\u0012\u0002020\u00042\b\b\u0001\u0010\u0012\u001a\u000201H'¢\u0006\u0004\b3\u00104J)\u00108\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u00106\u001a\u0002052\b\b\u0001\u0010\u0012\u001a\u000207H'¢\u0006\u0004\b8\u00109J\u0015\u0010;\u001a\b\u0012\u0004\u0012\u00020:0\u0004H'¢\u0006\u0004\b;\u0010\u0010J=\u0010A\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020@0,0\u00042\b\b\u0001\u0010\u0018\u001a\u00020<2\n\b\u0003\u0010>\u001a\u0004\u0018\u00010=2\n\b\u0003\u0010?\u001a\u0004\u0018\u000105H'¢\u0006\u0004\bA\u0010BJ+\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010C\u001a\u0002052\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010DH'¢\u0006\u0004\bE\u0010FJ'\u0010H\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020G0\n0\u00042\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\bH'¢\u0006\u0004\bH\u0010'J\u001f\u0010I\u001a\b\u0012\u0004\u0012\u00020@0\u00042\b\b\u0001\u0010C\u001a\u000205H'¢\u0006\u0004\bI\u0010JJ'\u0010L\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020K0\n0\u00042\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\bH'¢\u0006\u0004\bL\u0010'J'\u0010N\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020M0\n0\u00042\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\bH'¢\u0006\u0004\bN\u0010'J*\u0010S\u001a\b\u0012\u0004\u0012\u00020R0Q2\b\b\u0001\u0010O\u001a\u00020\b2\b\b\u0001\u0010\u0012\u001a\u00020PH§@¢\u0006\u0004\bS\u0010TJ \u0010V\u001a\b\u0012\u0004\u0012\u00020R0Q2\b\b\u0001\u0010\u0012\u001a\u00020UH§@¢\u0006\u0004\bV\u0010WJ\"\u0010X\u001a\b\u0012\u0004\u0012\u00020R0Q2\n\b\u0001\u0010C\u001a\u0004\u0018\u00010\bH§@¢\u0006\u0004\bX\u0010YJ\"\u0010Z\u001a\b\u0012\u0004\u0012\u00020R0Q2\n\b\u0001\u0010C\u001a\u0004\u0018\u00010\bH§@¢\u0006\u0004\bZ\u0010YJ%\u0010]\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\\0,0\u00042\b\b\u0001\u0010[\u001a\u00020\bH'¢\u0006\u0004\b]\u0010\rJ}\u0010i\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010_\u001a\u00020^2\b\b\u0001\u0010[\u001a\u00020^2\b\b\u0001\u0010`\u001a\u00020^2\n\b\u0001\u0010a\u001a\u0004\u0018\u00010^2\n\b\u0001\u0010b\u001a\u0004\u0018\u00010^2\b\b\u0001\u0010c\u001a\u00020^2\n\b\u0001\u0010d\u001a\u0004\u0018\u00010^2\b\b\u0001\u0010e\u001a\u0002052\u0010\b\u0001\u0010h\u001a\n\u0012\u0004\u0012\u00020g\u0018\u00010fH'¢\u0006\u0004\bi\u0010jJ)\u0010l\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010k\u001a\u00020\b2\b\b\u0001\u0010>\u001a\u00020\u0002H'¢\u0006\u0004\bl\u0010\u001aJ)\u0010m\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010k\u001a\u00020\b2\b\b\u0001\u0010>\u001a\u00020\u0002H'¢\u0006\u0004\bm\u0010\u001aJ\u0010\u0010o\u001a\u00020nH§@¢\u0006\u0004\bo\u0010pJ*\u0010s\u001a\b\u0012\u0004\u0012\u00020r0\n2\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010q\u001a\u00020\bH§@¢\u0006\u0004\bs\u0010tJ*\u0010v\u001a\b\u0012\u0004\u0012\u00020u0\n2\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010q\u001a\u00020\bH§@¢\u0006\u0004\bv\u0010tJ*\u0010x\u001a\b\u0012\u0004\u0012\u00020w0\n2\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010q\u001a\u00020\bH§@¢\u0006\u0004\bx\u0010tJ \u0010{\u001a\b\u0012\u0004\u0012\u00020z0Q2\b\b\u0001\u0010y\u001a\u00020\bH§@¢\u0006\u0004\b{\u0010|J*\u0010~\u001a\b\u0012\u0004\u0012\u00020}0\n2\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010q\u001a\u00020\bH§@¢\u0006\u0004\b~\u0010tJ*\u0010\u007f\u001a\b\u0012\u0004\u0012\u00020}0\n2\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010q\u001a\u00020\bH§@¢\u0006\u0004\b\u007f\u0010tJ$\u0010\u0082\u0001\u001a\t\u0012\u0005\u0012\u00030\u0081\u00010,2\t\b\u0001\u0010\u0080\u0001\u001a\u00020\bH§@¢\u0006\u0005\b\u0082\u0001\u0010|J%\u0010\u0086\u0001\u001a\t\u0012\u0005\u0012\u00030\u0085\u00010\u00042\n\b\u0001\u0010\u0084\u0001\u001a\u00030\u0083\u0001H'¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J\u001f\u0010\u0089\u0001\u001a\u00030\u0085\u00012\t\b\u0001\u0010\u0088\u0001\u001a\u000205H§@¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001J\u0018\u0010\u008c\u0001\u001a\t\u0012\u0005\u0012\u00030\u008b\u00010\u0004H'¢\u0006\u0005\b\u008c\u0001\u0010\u0010J\u0018\u0010\u008e\u0001\u001a\t\u0012\u0005\u0012\u00030\u008d\u00010\u0004H'¢\u0006\u0005\b\u008e\u0001\u0010\u0010J\u0018\u0010\u0090\u0001\u001a\t\u0012\u0005\u0012\u00030\u008f\u00010\u0004H'¢\u0006\u0005\b\u0090\u0001\u0010\u0010¨\u0006\u0091\u0001À\u0006\u0003"}, d2 = {"Lt3/b;", "", "", "status", "Lio/reactivex/Single;", "Lokhttp3/ResponseBody;", "gold", "(Ljava/lang/String;)Lio/reactivex/Single;", "", "pageId", "Lcom/app/network/network/response/DataResponse;", "Lcom/app/network/network/models/Transaction;", "magenta", "(I)Lio/reactivex/Single;", "Lcom/app/network/network/models/Wallet;", "echo", "()Lio/reactivex/Single;", "Lcom/app/network/network/models/VerifyDeviceRequest;", "request", "Lio/reactivex/Completable;", "xray", "(Lcom/app/network/network/models/VerifyDeviceRequest;)Lio/reactivex/Completable;", "Lcom/app/network/network/models/EnvelopNotification;", "sierra", Constants.KEY_TYPE, "fuchsia", "(ILjava/lang/String;)Lio/reactivex/Single;", "byId", "mike", "envelopeId", "charlie", "(Ljava/lang/String;)Lio/reactivex/Completable;", "Lcom/app/network/network/models/ActiveSuspension;", "kilo", "page", "Lcom/app/network/network/models/SuspensionHistoryItem;", "alpha", "Lcom/app/network/network/models/WithdrawTransaction;", "ivory", "(Ljava/lang/Integer;)Lio/reactivex/Single;", "whiskey", "november", "Lcom/app/network/network/models/ReferralResponse;", "emerald", "", "Lcom/app/network/network/models/FintechAccount;", "lima", "Lcom/app/network/network/models/Score;", "crimson", "Lcom/app/network/network/models/ProfileAttributesRequest;", "Lcom/app/network/network/models/CaptainProfileAttributeOtpResponse;", "zulu", "(Lcom/app/network/network/models/ProfileAttributesRequest;)Lio/reactivex/Single;", "", "otpVerificationId", "Lcom/app/network/network/models/OtpVerificationRequest;", "golf", "(JLcom/app/network/network/models/OtpVerificationRequest;)Lio/reactivex/Single;", "Lcom/app/network/network/models/NaqlBlockedReason;", "beige", "Lcom/app/network/network/models/AppAgreementTypeEnum;", "Lcom/app/network/network/models/AppAgreementSignatureOwnerTypeEnum;", "ownerType", "ownerId", "Lcom/app/network/network/models/agreement/AppAgreement;", "black", "(Lcom/app/network/network/models/AppAgreementTypeEnum;Lcom/app/network/network/models/AppAgreementSignatureOwnerTypeEnum;Ljava/lang/Long;)Lio/reactivex/Single;", Constants.KEY_ID, "Lcom/app/network/network/models/agreement/SignAppAgreementRequest;", "jade", "(JLcom/app/network/network/models/agreement/SignAppAgreementRequest;)Lio/reactivex/Single;", "Lcom/app/network/network/models/SignedAppAgreement;", "oscar", "quebec", "(J)Lio/reactivex/Single;", "Lcom/app/network/network/models/captian/Assets;", "gray", "Lcom/app/network/network/models/TransferCard;", "indigo", "assetId", "Lcom/app/network/network/models/captian/ReturnAssetRequest;", "Lvg/aq;", "Ljava/lang/Void;", "yankee", "(ILcom/app/network/network/models/captian/ReturnAssetRequest;LNd/c;)Ljava/lang/Object;", "Lcom/app/network/network/models/UrPayUpdateRequest;", "amber", "(Lcom/app/network/network/models/UrPayUpdateRequest;LNd/c;)Ljava/lang/Object;", "hotel", "(Ljava/lang/Integer;LNd/c;)Ljava/lang/Object;", "bravo", "taskAddressId", "Lcom/app/network/network/models/AddressNoteListItem;", "bronze", "Lokhttp3/RequestBody;", "orderTaskId", "description", "latitude", "longitude", "addressType", "metadata", "inputInitiatedAtTimeStamp", "", "Lokhttp3/MultipartBody$Part;", "attachments", "papa", "(Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;J[Lokhttp3/MultipartBody$Part;)Lio/reactivex/Single;", "noteId", "india", "coral", "Lcom/app/network/network/models/points/PointsVaultResponse;", "blue", "(LNd/c;)Ljava/lang/Object;", "pageSize", "Lcom/app/network/network/models/points/PointsTransactionResponse;", "tango", "(IILNd/c;)Ljava/lang/Object;", "Lcom/app/network/network/models/points/PointingRuleResponse;", "romeo", "Lcom/app/network/network/models/points/redeem/PointRewardResponse;", "azure", "rewardId", "", "uniform", "(ILNd/c;)Ljava/lang/Object;", "Lcom/app/network/network/models/trophies/Trophy;", "delta", "foxtrot", "trophyId", "Lcom/app/network/network/models/trophies/TrophyMilestone;", "lavender", "", "amount", "Lcom/app/network/network/models/WalletTopUpResponse;", "cyan", "(D)Lio/reactivex/Single;", "topUpId", "green", "(JLNd/c;)Ljava/lang/Object;", "Lcom/app/network/network/models/CaptainQrResponse;", "victor", "Lcom/app/network/network/models/CaptainClaimUnsettled;", "juliet", "Lcom/app/network/network/models/WalletSettlementResponse;", "lime", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* renamed from: t3.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC2957b {
    @yg.f("captains/suspension_history")
    @NotNull
    Single<DataResponse<SuspensionHistoryItem>> alpha(@t("pageId") int page);

    @n("captains")
    @Nullable
    Object amber(@NotNull @yg.a UrPayUpdateRequest urPayUpdateRequest, @NotNull Nd.c<? super aq<Void>> cVar);

    @yg.f("/api/v1/point_rewards")
    @Nullable
    Object azure(@t("pageId") int i4, @t("pageSize") int i5, @NotNull Nd.c<? super DataResponse<PointRewardResponse>> cVar);

    @yg.f("captains/naql_blocked_reasons")
    @NotNull
    Single<NaqlBlockedReason> beige();

    @yg.f("app_agreements/unsigned")
    @NotNull
    Single<List<AppAgreement>> black(@t("type") @NotNull AppAgreementTypeEnum type, @t("ownerType") @Nullable AppAgreementSignatureOwnerTypeEnum ownerType, @t("ownerId") @Nullable Long ownerId);

    @yg.f("/api/v1/point_vaults")
    @Nullable
    Object blue(@NotNull Nd.c<? super PointsVaultResponse> cVar);

    @n("transfer_cards/{id}/REJECTED")
    @Nullable
    Object bravo(@s("id") @Nullable Integer num, @NotNull Nd.c<? super aq<Void>> cVar);

    @yg.f("/api/v1/captain_address_notes/latest")
    @NotNull
    Single<List<AddressNoteListItem>> bronze(@t("taskAddressId") int taskAddressId);

    @n("captains/envelopes/{id}/read")
    @NotNull
    Completable charlie(@s("id") @NotNull String envelopeId);

    @n("/api/v1/captain_address_notes/{noteId}/vote/DOWN_VOTE")
    @NotNull
    Single<ResponseBody> coral(@s("noteId") int noteId, @t("ownerType") @NotNull String ownerType);

    @yg.f("captain_metrics/score")
    @NotNull
    Single<List<Score>> crimson();

    @o("wallet_topups")
    @NotNull
    @yg.e
    Single<WalletTopUpResponse> cyan(@yg.c("amount") double amount);

    @yg.f("/api/v1/trophies/completed")
    @Nullable
    Object delta(@t("pageId") int i4, @t("pageSize") int i5, @NotNull Nd.c<? super DataResponse<Trophy>> cVar);

    @yg.f("wallet")
    @NotNull
    Single<Wallet> echo();

    @yg.f("captains/referral")
    @NotNull
    Single<ReferralResponse> emerald();

    @yg.f("/api/v1/trophies/active")
    @Nullable
    Object foxtrot(@t("pageId") int i4, @t("pageSize") int i5, @NotNull Nd.c<? super DataResponse<Trophy>> cVar);

    @yg.f("captains/envelopes")
    @NotNull
    Single<DataResponse<EnvelopNotification>> fuchsia(@t("pageId") int pageId, @t("type") @NotNull String type);

    @n("captains/rider/status/{status}")
    @NotNull
    Single<ResponseBody> gold(@s("status") @NotNull String status);

    @n("otp_verifications/{otpVerificationId}")
    @NotNull
    Single<ResponseBody> golf(@s("otpVerificationId") long otpVerificationId, @NotNull @yg.a OtpVerificationRequest request);

    @yg.f("assets")
    @NotNull
    Single<DataResponse<Assets>> gray(@t("pageId") @Nullable Integer pageId);

    @yg.f("wallet_topups/{id}")
    @Nullable
    Object green(@s("id") long j5, @NotNull Nd.c<? super WalletTopUpResponse> cVar);

    @n("transfer_cards/{id}/ACCEPTED")
    @Nullable
    Object hotel(@s("id") @Nullable Integer num, @NotNull Nd.c<? super aq<Void>> cVar);

    @n("/api/v1/captain_address_notes/{noteId}/vote/UP_VOTE")
    @NotNull
    Single<ResponseBody> india(@s("noteId") int noteId, @t("ownerType") @NotNull String ownerType);

    @yg.f("transfer_cards")
    @NotNull
    Single<DataResponse<TransferCard>> indigo(@t("pageId") @Nullable Integer pageId);

    @yg.f("withdraw_requests")
    @NotNull
    Single<DataResponse<WithdrawTransaction>> ivory(@t("pageId") @Nullable Integer pageId);

    @n("app_agreements/{id}/sign")
    @NotNull
    Single<ResponseBody> jade(@s("id") long id2, @Nullable @yg.a SignAppAgreementRequest request);

    @yg.f("captain_claims/unsettled")
    @NotNull
    Single<CaptainClaimUnsettled> juliet();

    @yg.f("captains/active_suspension")
    @NotNull
    Single<ActiveSuspension> kilo();

    @yg.f("/api/v1/captain_trophy_milestones")
    @Nullable
    Object lavender(@t("trophyId") int i4, @NotNull Nd.c<? super List<TrophyMilestone>> cVar);

    @yg.f("fintech/all")
    @NotNull
    Single<List<FintechAccount>> lima();

    @n("captain_claims/settle")
    @NotNull
    Single<WalletSettlementResponse> lime();

    @yg.f("wallet/transactions")
    @NotNull
    Single<DataResponse<Transaction>> magenta(@t("pageId") int pageId);

    @yg.f("captains/envelopes/{id}")
    @NotNull
    Single<EnvelopNotification> mike(@s("id") @NotNull String byId);

    @n("/api/v1/withdraw_requests/{id}/cancel")
    @NotNull
    Single<WithdrawTransaction> november(@s("id") int byId);

    @yg.f("app_agreements/signed")
    @NotNull
    Single<DataResponse<SignedAppAgreement>> oscar(@t("pageId") @Nullable Integer pageId);

    @l
    @o("/api/v1/captain_address_notes")
    @NotNull
    Single<ResponseBody> papa(@NotNull @q("orderTaskId") RequestBody orderTaskId, @NotNull @q("taskAddressId") RequestBody taskAddressId, @NotNull @q("description") RequestBody description, @Nullable @q("latitude") RequestBody latitude, @Nullable @q("longitude") RequestBody longitude, @NotNull @q("addressType") RequestBody addressType, @Nullable @q("metadata") RequestBody metadata, @q("inputInitiatedAtTimeStamp") long inputInitiatedAtTimeStamp, @Nullable @q MultipartBody.Part[] attachments);

    @yg.f("app_agreements/{id}")
    @NotNull
    Single<AppAgreement> quebec(@s("id") long id2);

    @yg.f("/api/v1/pointing_rules")
    @Nullable
    Object romeo(@t("pageId") int i4, @t("pageSize") int i5, @NotNull Nd.c<? super DataResponse<PointingRuleResponse>> cVar);

    @yg.f("captains/envelopes")
    @NotNull
    Single<DataResponse<EnvelopNotification>> sierra(@t("pageId") int pageId);

    @yg.f("/api/v1/point_vault_transactions")
    @Nullable
    Object tango(@t("pageId") int i4, @t("pageSize") int i5, @NotNull Nd.c<? super DataResponse<PointsTransactionResponse>> cVar);

    @n("/api/v1/point_rewards/{id}/redeem")
    @Nullable
    Object uniform(@s("id") int i4, @NotNull Nd.c<? super aq<Unit>> cVar);

    @yg.f("captains/qr")
    @NotNull
    Single<CaptainQrResponse> victor();

    @yg.f("withdraw_requests/{id}")
    @NotNull
    Single<WithdrawTransaction> whiskey(@s("id") int byId);

    @o("devices/verify")
    @NotNull
    Completable xray(@NotNull @yg.a VerifyDeviceRequest request);

    @n("assets/{id}/return")
    @Nullable
    Object yankee(@s("id") int i4, @NotNull @yg.a ReturnAssetRequest returnAssetRequest, @NotNull Nd.c<? super aq<Void>> cVar);

    @n("captains/update_profile_attributes")
    @NotNull
    Single<CaptainProfileAttributeOtpResponse> zulu(@NotNull @yg.a ProfileAttributesRequest request);
}
