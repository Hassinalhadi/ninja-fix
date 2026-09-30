package delivery.samurai.android.ui.splash;

import Da.a;
import Fc.b;
import KingArchersMougraphAlsopromas0.AlwaysMougraohSmootihbngmode;
import KingArchersMougraphAlsopromas0.hidden.Hidden0;
import N9.m;
import Nd.c;
import android.content.Context;
import androidx.lifecycle.az;
import com.app.base.BaseViewModel;
import com.app.feature.location.store.LastSentLocationStore;
import com.app.network.network.models.ChangePasswordRequest;
import com.app.network.network.models.Country;
import com.app.network.network.models.ResetPasswordRequest;
import com.app.network.network.models.SignUpRequest;
import com.app.network.network.models.SignUpResponse;
import com.app.network.network.models.UserIdentityRequestResponse;
import com.app.network.network.models.UserIdentityStatus;
import com.app.network.network.models.UserInfo;
import com.app.network.network.response.DataResponse;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputLayout;
import com.zendesk.service.HttpConstants;
import delivery.samurai.android.AndroidApp;
import ea.InterfaceC1643a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import retrofit2.HttpException;
import t3.InterfaceC2956a;
import ua.InterfaceC3147a;
import vf.I;
import yf.AbstractC3428A;
import yf.L;
import yf.N;
import yf.as;
import yf.at;
import yf.av;
import yf.aw;

/* compiled from: Dex2C */
@Metadata(d1 = {"\u0000¤\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001:\u0004´\u0001ë\u0001B9\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0014\u001a\u00020\u00122\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010\"\u001a\u00020\u00122\u0014\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0006\u0012\u0004\u0018\u00010 0\u001e¢\u0006\u0004\b\"\u0010#J\u001d\u0010&\u001a\u00020\u00122\u0006\u0010$\u001a\u00020 2\u0006\u0010%\u001a\u00020 ¢\u0006\u0004\b&\u0010'J\u001b\u0010*\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010)0(0\u0016¢\u0006\u0004\b*\u0010\u0019J!\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0(0\u00162\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b-\u0010.J!\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0(0\u00162\u0006\u0010,\u001a\u00020/¢\u0006\u0004\b0\u00101J\r\u00102\u001a\u00020\u0012¢\u0006\u0004\b2\u00103J\u001f\u00106\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000205040(0\u0016¢\u0006\u0004\b6\u0010\u0019J\u0013\u00107\u001a\b\u0012\u0004\u0012\u00020504¢\u0006\u0004\b7\u00108J\u001f\u0010;\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020:090(0\u0016¢\u0006\u0004\b;\u0010\u0019J\u0013\u0010<\u001a\b\u0012\u0004\u0012\u00020:09¢\u0006\u0004\b<\u0010=J/\u0010A\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020@090(0\u00162\u0006\u0010>\u001a\u00020\u001f2\u0006\u0010?\u001a\u00020\u001f¢\u0006\u0004\bA\u0010BJ\u001f\u0010D\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020C040(0\u0016¢\u0006\u0004\bD\u0010\u0019J\u001f\u0010F\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020E040(0\u0016¢\u0006\u0004\bF\u0010\u0019J'\u0010H\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020E040(0\u00162\u0006\u0010G\u001a\u00020\u001f¢\u0006\u0004\bH\u0010IJë\u0001\u0010`\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0(0\u00162\u0006\u0010J\u001a\u00020 2\u0006\u0010K\u001a\u00020 2\u0006\u0010L\u001a\u00020 2\u0006\u0010M\u001a\u00020 2\u0006\u0010N\u001a\u00020\u001f2\u0006\u0010O\u001a\u00020 2\u0006\u0010P\u001a\u00020 2\u0006\u0010Q\u001a\u00020 2\u0006\u0010R\u001a\u00020\u001f2\u0006\u0010S\u001a\u00020\u001f2\u0006\u0010T\u001a\u00020 2\b\u0010U\u001a\u0004\u0018\u00010 2\u0006\u0010V\u001a\u00020 2\u0006\u0010W\u001a\u00020 2\b\u0010X\u001a\u0004\u0018\u00010\u001f2\b\u0010Y\u001a\u0004\u0018\u00010 2\b\u0010Z\u001a\u0004\u0018\u00010 2\b\u0010[\u001a\u0004\u0018\u00010 2\b\u0010\\\u001a\u0004\u0018\u00010 2\b\u0010]\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010G\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010^\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010_\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b`\u0010aJ!\u0010d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020c0(0\u00162\u0006\u0010b\u001a\u00020 ¢\u0006\u0004\bd\u0010eJ\u001d\u0010f\u001a\u00020\u00122\u0006\u0010,\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020c¢\u0006\u0004\bf\u0010gJ5\u0010p\u001a\u00020o2\u0006\u0010i\u001a\u00020h2\n\b\u0002\u0010k\u001a\u0004\u0018\u00010j2\n\b\u0002\u0010l\u001a\u0004\u0018\u00010\u001f2\u0006\u0010n\u001a\u00020m¢\u0006\u0004\bp\u0010qJ\r\u0010r\u001a\u00020\u0012¢\u0006\u0004\br\u00103J\u0018\u0010v\u001a\u00020u2\u0006\u0010t\u001a\u00020sH\u0086@¢\u0006\u0004\bv\u0010wJ)\u0010z\u001a\u00020\u00122\u0006\u0010t\u001a\u00020s2\b\b\u0002\u0010x\u001a\u00020s2\b\b\u0002\u0010y\u001a\u00020s¢\u0006\u0004\bz\u0010{J\r\u0010|\u001a\u00020\u0012¢\u0006\u0004\b|\u00103J\u0017\u0010~\u001a\u00020\u00122\u0006\u0010}\u001a\u00020 H\u0002¢\u0006\u0004\b~\u0010\u007fJ\u0011\u0010\u0080\u0001\u001a\u00020\u0012H\u0002¢\u0006\u0005\b\u0080\u0001\u00103J\u0012\u0010\u0081\u0001\u001a\u00020oH\u0002¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J\u0012\u0010\u0083\u0001\u001a\u00020oH\u0002¢\u0006\u0006\b\u0083\u0001\u0010\u0082\u0001J\u0012\u0010\u0084\u0001\u001a\u00020oH\u0002¢\u0006\u0006\b\u0084\u0001\u0010\u0082\u0001J\u0012\u0010\u0085\u0001\u001a\u00020oH\u0002¢\u0006\u0006\b\u0085\u0001\u0010\u0082\u0001J\u0012\u0010\u0086\u0001\u001a\u00020oH\u0002¢\u0006\u0006\b\u0086\u0001\u0010\u0082\u0001J!\u0010\u0088\u0001\u001a\u00020\u00122\r\u0010\u0087\u0001\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0002¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J!\u0010\u008a\u0001\u001a\u00020\u00122\r\u0010\u0087\u0001\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0002¢\u0006\u0006\b\u008a\u0001\u0010\u0089\u0001J\u001a\u0010\u008c\u0001\u001a\u00020\u00122\u0007\u0010\u008b\u0001\u001a\u00020\u001aH\u0002¢\u0006\u0005\b\u008c\u0001\u0010\u001dJ\u001a\u0010\u008d\u0001\u001a\u00020\u00122\u0007\u0010\u008b\u0001\u001a\u00020\u001aH\u0002¢\u0006\u0005\b\u008d\u0001\u0010\u001dJ!\u0010\u008e\u0001\u001a\u00020\u00122\r\u0010\u0087\u0001\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0002¢\u0006\u0006\b\u008e\u0001\u0010\u0089\u0001J\u0011\u0010\u008f\u0001\u001a\u00020\u0012H\u0002¢\u0006\u0005\b\u008f\u0001\u00103J*\u0010\u0091\u0001\u001a\u00020\u00122\r\u0010\u0087\u0001\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0007\u0010\u0090\u0001\u001a\u00020oH\u0002¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001JF\u0010\u0096\u0001\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020 2\u0006\u0010%\u001a\u00020 2\t\u0010\u0093\u0001\u001a\u0004\u0018\u00010 2\t\u0010\u0094\u0001\u001a\u0004\u0018\u00010 2\u000b\b\u0002\u0010\u0095\u0001\u001a\u0004\u0018\u00010 H\u0082@¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001J\u001c\u0010\u009a\u0001\u001a\u00020o2\b\u0010\u0099\u0001\u001a\u00030\u0098\u0001H\u0002¢\u0006\u0006\b\u009a\u0001\u0010\u009b\u0001J+\u0010\u009c\u0001\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010 \u0012\u0006\u0012\u0004\u0018\u00010 0\u001e2\u0006\u0010$\u001a\u00020 H\u0082@¢\u0006\u0006\b\u009c\u0001\u0010\u009d\u0001J\u001d\u0010\u009f\u0001\u001a\u0004\u0018\u00010 2\u0007\u0010\u009e\u0001\u001a\u00020 H\u0002¢\u0006\u0006\b\u009f\u0001\u0010 \u0001J\u0017\u0010¡\u0001\u001a\b\u0012\u0004\u0012\u00020509H\u0002¢\u0006\u0005\b¡\u0001\u0010=J\u0017\u0010¢\u0001\u001a\b\u0012\u0004\u0012\u00020@09H\u0002¢\u0006\u0005\b¢\u0001\u0010=J\u001c\u0010¤\u0001\u001a\u00020o2\b\u0010\u0094\u0001\u001a\u00030£\u0001H\u0002¢\u0006\u0006\b¤\u0001\u0010¥\u0001J\u001b\u0010¤\u0001\u001a\u00020o2\u0007\u0010¦\u0001\u001a\u00020uH\u0002¢\u0006\u0006\b¤\u0001\u0010§\u0001R\u0015\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0003\u0010¨\u0001R\u0015\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0005\u0010©\u0001R\u0015\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0007\u0010ª\u0001R\u0015\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\t\u0010«\u0001R\u0015\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000b\u0010¬\u0001R\u0015\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\r\u0010\u00ad\u0001R\u0017\u0010®\u0001\u001a\u00020 8\u0002X\u0082D¢\u0006\b\n\u0006\b®\u0001\u0010¯\u0001R\u0017\u0010°\u0001\u001a\u00020\u001f8\u0002X\u0082D¢\u0006\b\n\u0006\b°\u0001\u0010±\u0001R\u0017\u0010²\u0001\u001a\u00020 8\u0002X\u0082D¢\u0006\b\n\u0006\b²\u0001\u0010¯\u0001R\u0017\u0010³\u0001\u001a\u00020 8\u0002X\u0082D¢\u0006\b\n\u0006\b³\u0001\u0010¯\u0001R,\u0010¶\u0001\u001a\u0013\u0012\u000f\u0012\r µ\u0001*\u0005\u0018\u00010´\u00010´\u00010\u00168\u0006¢\u0006\u000f\n\u0006\b¶\u0001\u0010·\u0001\u001a\u0005\b¸\u0001\u0010\u0019R.\u0010¹\u0001\u001a\b\u0012\u0004\u0012\u000205048\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b¹\u0001\u0010º\u0001\u001a\u0005\b»\u0001\u00108\"\u0006\b¼\u0001\u0010½\u0001R\u001e\u0010¿\u0001\u001a\t\u0012\u0004\u0012\u00020\u00110¾\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¿\u0001\u0010À\u0001R#\u0010Â\u0001\u001a\t\u0012\u0004\u0012\u00020\u00110Á\u00018\u0006¢\u0006\u0010\n\u0006\bÂ\u0001\u0010Ã\u0001\u001a\u0006\bÄ\u0001\u0010Å\u0001R(\u0010Æ\u0001\u001a\u0011\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010(0¾\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÆ\u0001\u0010À\u0001R+\u0010Ç\u0001\u001a\u0011\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010(0Á\u00018\u0006¢\u0006\u0010\n\u0006\bÇ\u0001\u0010Ã\u0001\u001a\u0006\bÈ\u0001\u0010Å\u0001R\u001f\u0010Ê\u0001\u001a\n\u0012\u0005\u0012\u00030É\u00010¾\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÊ\u0001\u0010À\u0001R$\u0010Ë\u0001\u001a\n\u0012\u0005\u0012\u00030É\u00010Á\u00018\u0006¢\u0006\u0010\n\u0006\bË\u0001\u0010Ã\u0001\u001a\u0006\bÌ\u0001\u0010Å\u0001R)\u0010Í\u0001\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000205090(0\u00168\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÍ\u0001\u0010·\u0001R0\u0010Î\u0001\u001a\n\u0012\u0004\u0012\u000205\u0018\u0001048\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\bÎ\u0001\u0010º\u0001\u001a\u0005\bÏ\u0001\u00108\"\u0006\bÐ\u0001\u0010½\u0001R \u0010Ñ\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010u0¾\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÑ\u0001\u0010À\u0001R%\u0010Ò\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010u0Á\u00018\u0006¢\u0006\u0010\n\u0006\bÒ\u0001\u0010Ã\u0001\u001a\u0006\bÓ\u0001\u0010Å\u0001R\u001f\u0010Õ\u0001\u001a\n\u0012\u0005\u0012\u00030£\u00010Ô\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÕ\u0001\u0010Ö\u0001R$\u0010Ø\u0001\u001a\n\u0012\u0005\u0012\u00030£\u00010×\u00018\u0006¢\u0006\u0010\n\u0006\bØ\u0001\u0010Ù\u0001\u001a\u0006\bÚ\u0001\u0010Û\u0001R\u001e\u0010Ü\u0001\u001a\t\u0012\u0004\u0012\u00020 0Ô\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÜ\u0001\u0010Ö\u0001R#\u0010Ý\u0001\u001a\t\u0012\u0004\u0012\u00020 0×\u00018\u0006¢\u0006\u0010\n\u0006\bÝ\u0001\u0010Ù\u0001\u001a\u0006\bÞ\u0001\u0010Û\u0001R\u001c\u0010à\u0001\u001a\u0005\u0018\u00010ß\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bà\u0001\u0010á\u0001R\u0019\u0010â\u0001\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bâ\u0001\u0010±\u0001R)\u0010ã\u0001\u001a\u00020o8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bã\u0001\u0010ä\u0001\u001a\u0006\bã\u0001\u0010\u0082\u0001\"\u0006\bå\u0001\u0010æ\u0001R\u0019\u0010ç\u0001\u001a\u00020o8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bç\u0001\u0010ä\u0001R%\u0010é\u0001\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000205090(0\u00168F¢\u0006\u0007\u001a\u0005\bè\u0001\u0010\u0019R\u0014\u0010ê\u0001\u001a\u00020o8F¢\u0006\b\u001a\u0006\bê\u0001\u0010\u0082\u0001¨\u0006ì\u0001"}, d2 = {"Ldelivery/samurai/android/ui/splash/AuthViewModel;", "Lcom/app/base/BaseViewModel;", "Ldelivery/samurai/android/AndroidApp;", "app", "Lua/a;", "signInRepository", "Lt3/a;", "authService", "LN9/m;", "unleashContextUpdater", "Lcom/app/feature/location/store/LastSentLocationStore;", "lastSentLocationStore", "Lea/a;", "analyticsTracker", "<init>", "(Ldelivery/samurai/android/AndroidApp;Lua/a;Lt3/a;LN9/m;Lcom/app/feature/location/store/LastSentLocationStore;Lea/a;)V", "Lkotlin/Function1;", "Lcom/app/network/network/models/SignUpRequest;", "", "updateBlock", "updateRequest", "(Lkotlin/jvm/functions/Function1;)V", "Landroidx/lifecycle/az;", "Lcom/app/network/network/models/AppState;", "setup", "()Landroidx/lifecycle/az;", "Lcom/app/network/network/models/UserInfo;", "response", "completeLoginAfterNafathVerified", "(Lcom/app/network/network/models/UserInfo;)V", "Lkotlin/Pair;", "", "", "value", "setUploadDocument", "(Lkotlin/Pair;)V", "email", "password", "onSignIn", "(Ljava/lang/String;Ljava/lang/String;)V", "Lr3/a;", "", "onLogout", "Lcom/app/network/network/models/ChangePasswordRequest;", "request", "changePassword", "(Lcom/app/network/network/models/ChangePasswordRequest;)Landroidx/lifecycle/az;", "Lcom/app/network/network/models/ResetPasswordRequest;", "resetPassword", "(Lcom/app/network/network/models/ResetPasswordRequest;)Landroidx/lifecycle/az;", "getCountries", "()V", "", "Lcom/app/network/network/models/Country;", "getNationalities", "readNationalitiesFromAssets", "()Ljava/util/List;", "Lcom/app/network/network/response/DataResponse;", "Lcom/app/network/network/models/Bank;", "getBanks", "getCachedBanks", "()Lcom/app/network/network/response/DataResponse;", "ofCountryId", "page", "Lcom/app/network/network/models/City;", "getCities", "(II)Landroidx/lifecycle/az;", "Lcom/app/network/network/models/PreferredVerticalResponse;", "getPreferredVerticals", "Lcom/app/network/network/models/PlatformListResponse;", "getPlatformList", Constants.KEY_ID, "getPlatformListByCountryId", "(I)Landroidx/lifecycle/az;", "name", "idNumber", "dob", "preference", "preferredPlatformId", "vehiclePlateNumber", "vehicleSequenceNumber", "nationality", "countryId", "cityId", "mobileNo", "fintechId", "IBAN_name", "IBAN_no", "bankId", "referralCode", "idCardSnap", "drivingLicenseSnap", "vehicleRegistrationSnap", "profileSnap", "urPayAccountIban", "urPayIdNumber", "signUp", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroidx/lifecycle/az;", "forRequestId", "Lcom/app/network/network/models/SignUpResponse;", "getSignUpRequestDetail", "(Ljava/lang/String;)Landroidx/lifecycle/az;", "driverDraftMapper", "(Lcom/app/network/network/models/SignUpRequest;Lcom/app/network/network/models/SignUpResponse;)V", "Lcom/google/android/material/textfield/TextInputLayout;", "field", "Lkotlin/text/Regex;", "regex", "errorMsg", "Landroid/content/Context;", "context", "", "validateField", "(Lcom/google/android/material/textfield/TextInputLayout;Lkotlin/text/Regex;Ljava/lang/Integer;Landroid/content/Context;)Z", "resetCountriesPagination", "", "requestId", "Lcom/app/network/network/models/UserIdentityRequestResponse;", "getUserIdentityRequest", "(JLNd/c;)Ljava/lang/Object;", "periodMs", "timeoutMs", "startNafathPolling", "(JJJ)V", "stopNafathPolling", Constants.KEY_MESSAGE, "piLog", "(Ljava/lang/String;)V", "loadNationalitiesIfNeeded", "isFirebaseTokenMissing", "()Z", "isUUIDMissing", "isDeviceInfoMismatch", "isCaptainMissing", "isLocationPermissionMissing", "liveData", "fetchFirebaseToken", "(Landroidx/lifecycle/az;)V", "registerDevice", "userInfo", "trackShiftStartIfNeeded", "trackShiftEndIfNeeded", "updateDeviceInfo", "fetchCaptainInfoAfterLogin", "isFinalCheck", "fetchCaptainInfo", "(Landroidx/lifecycle/az;Z)V", "token", "status", "incogniaToken", "loginOnce", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LNd/c;)Ljava/lang/Object;", "Lretrofit2/HttpException;", "e", "isDeviceVerificationChallenge", "(Lretrofit2/HttpException;)Z", "fetchPlayIntegrityHeaders", "(Ljava/lang/String;LNd/c;)Ljava/lang/Object;", "entryPoint", "blockedByIntegrityMessage", "(Ljava/lang/String;)Ljava/lang/String;", "getCachedCountries", "getCachedCities", "Lcom/app/network/network/models/UserIdentityStatus;", "isTerminal", "(Lcom/app/network/network/models/UserIdentityStatus;)Z", "resp", "(Lcom/app/network/network/models/UserIdentityRequestResponse;)Z", "Ldelivery/samurai/android/AndroidApp;", "Lua/a;", "Lt3/a;", "LN9/m;", "Lcom/app/feature/location/store/LastSentLocationStore;", "Lea/a;", "PI_TAG", "Ljava/lang/String;", "HTTP_FORBIDDEN", "I", "DEVICE_VERIFICATION_REQUIRED_HEADER", "PLAY_INTEGRITY", "LFc/b;", "kotlin.jvm.PlatformType", "signUpValidation", "Landroidx/lifecycle/az;", "getSignUpValidation", "countriesList", "Ljava/util/List;", "getCountriesList", "setCountriesList", "(Ljava/util/List;)V", "Lyf/at;", "_signUpRequest", "Lyf/at;", "Lyf/L;", "signUpRequest", "Lyf/L;", "getSignUpRequest", "()Lyf/L;", "_signInResponseState", "signInResponseState", "getSignInResponseState", "LDa/a;", "_uploadedDocument", "uploadedDocument", "getUploadedDocument", "_countriesLiveData", "cachedNationalities", "getCachedNationalities", "setCachedNationalities", "_nafathState", "nafathState", "getNafathState", "Lyf/as;", "_nafathTerminal", "Lyf/as;", "Lyf/aw;", "nafathTerminal", "Lyf/aw;", "getNafathTerminal", "()Lyf/aw;", "_nafathError", "nafathError", "getNafathError", "Lvf/I;", "nafathJob", "Lvf/I;", "currentPage", "isLastPage", "Z", "setLastPage", "(Z)V", "isLoading", "getCountriesLiveData", "countriesLiveData", "isCountriesLoading", "Fc/a", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AuthViewModel extends BaseViewModel {
    public static final int $stable = 8;
    private final String DEVICE_VERIFICATION_REQUIRED_HEADER;
    private final int HTTP_FORBIDDEN;
    private final String PI_TAG;
    private final String PLAY_INTEGRITY;
    private final az _countriesLiveData;
    private final as _nafathError;
    private final at _nafathState;
    private final as _nafathTerminal;
    private at _signInResponseState;
    private final at _signUpRequest;
    private final at _uploadedDocument;
    private final InterfaceC1643a analyticsTracker;
    private final AndroidApp app;
    private final InterfaceC2956a authService;
    private List<Country> cachedNationalities;
    private List<Country> countriesList;
    private int currentPage;
    private boolean isLastPage;
    private boolean isLoading;
    private final LastSentLocationStore lastSentLocationStore;
    private final aw nafathError;
    private I nafathJob;
    private final L nafathState;
    private final aw nafathTerminal;
    private final InterfaceC3147a signInRepository;
    private final L signInResponseState;
    private final L signUpRequest;
    private final az signUpValidation;
    private final m unleashContextUpdater;
    private final L uploadedDocument;

    static {
        AlwaysMougraohSmootihbngmode.registerNativesForClass(131, AuthViewModel.class);
        Hidden0.special_clinit_131_00(AuthViewModel.class);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthViewModel(AndroidApp app, InterfaceC3147a signInRepository, InterfaceC2956a authService, m unleashContextUpdater, LastSentLocationStore lastSentLocationStore, InterfaceC1643a analyticsTracker) {
        super(app);
        Intrinsics.echo(app, "app");
        Intrinsics.echo(signInRepository, "signInRepository");
        Intrinsics.echo(authService, "authService");
        Intrinsics.echo(unleashContextUpdater, "unleashContextUpdater");
        Intrinsics.echo(lastSentLocationStore, "lastSentLocationStore");
        Intrinsics.echo(analyticsTracker, "analyticsTracker");
        this.app = app;
        this.signInRepository = signInRepository;
        this.authService = authService;
        this.unleashContextUpdater = unleashContextUpdater;
        this.lastSentLocationStore = lastSentLocationStore;
        this.analyticsTracker = analyticsTracker;
        this.PI_TAG = "PIFlow";
        this.HTTP_FORBIDDEN = HttpConstants.HTTP_FORBIDDEN;
        this.DEVICE_VERIFICATION_REQUIRED_HEADER = "X-Device-Verification-Required";
        this.PLAY_INTEGRITY = "PLAY_INTEGRITY";
        this.signUpValidation = new az(b.purple);
        this.countriesList = CollectionsKt.emptyList();
        N charlie = AbstractC3428A.charlie(new SignUpRequest(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16777215, null));
        this._signUpRequest = charlie;
        this.signUpRequest = new av(charlie);
        N charlie2 = AbstractC3428A.charlie(null);
        this._signInResponseState = charlie2;
        this.signInResponseState = new av(charlie2);
        N charlie3 = AbstractC3428A.charlie(new a(null, null, null, null));
        this._uploadedDocument = charlie3;
        this.uploadedDocument = new av(charlie3);
        this._countriesLiveData = new az();
        N charlie4 = AbstractC3428A.charlie(null);
        this._nafathState = charlie4;
        this.nafathState = new av(charlie4);
        yf.az bravo = AbstractC3428A.bravo(0, 1, null, 5);
        this._nafathTerminal = bravo;
        this.nafathTerminal = bravo;
        yf.az bravo2 = AbstractC3428A.bravo(0, 1, null, 5);
        this._nafathError = bravo2;
        this.nafathError = bravo2;
        loadNationalitiesIfNeeded();
    }

    public static final native /* synthetic */ String access$blockedByIntegrityMessage(AuthViewModel authViewModel, String str);

    public static final native /* synthetic */ void access$fetchCaptainInfoAfterLogin(AuthViewModel authViewModel);

    public static final native /* synthetic */ Object access$fetchPlayIntegrityHeaders(AuthViewModel authViewModel, String str, c cVar);

    public static final native /* synthetic */ InterfaceC1643a access$getAnalyticsTracker$p(AuthViewModel authViewModel);

    public static final native /* synthetic */ AndroidApp access$getApp$p(AuthViewModel authViewModel);

    public static final native /* synthetic */ InterfaceC2956a access$getAuthService$p(AuthViewModel authViewModel);

    public static final native /* synthetic */ DataResponse access$getCachedCities(AuthViewModel authViewModel);

    public static final native /* synthetic */ DataResponse access$getCachedCountries(AuthViewModel authViewModel);

    public static final native /* synthetic */ int access$getCurrentPage$p(AuthViewModel authViewModel);

    public static final native /* synthetic */ LastSentLocationStore access$getLastSentLocationStore$p(AuthViewModel authViewModel);

    public static final native /* synthetic */ m access$getUnleashContextUpdater$p(AuthViewModel authViewModel);

    public static final native /* synthetic */ az access$get_countriesLiveData$p(AuthViewModel authViewModel);

    public static final native /* synthetic */ as access$get_nafathError$p(AuthViewModel authViewModel);

    public static final native /* synthetic */ at access$get_nafathState$p(AuthViewModel authViewModel);

    public static final native /* synthetic */ as access$get_nafathTerminal$p(AuthViewModel authViewModel);

    public static final native /* synthetic */ at access$get_signInResponseState$p(AuthViewModel authViewModel);

    public static final native /* synthetic */ at access$get_signUpRequest$p(AuthViewModel authViewModel);

    public static final native /* synthetic */ boolean access$isDeviceVerificationChallenge(AuthViewModel authViewModel, HttpException httpException);

    public static final native /* synthetic */ boolean access$isTerminal(AuthViewModel authViewModel, UserIdentityStatus userIdentityStatus);

    public static final native /* synthetic */ Object access$loginOnce(AuthViewModel authViewModel, String str, String str2, String str3, String str4, String str5, c cVar);

    public static final native /* synthetic */ void access$piLog(AuthViewModel authViewModel, String str);

    public static final native /* synthetic */ void access$registerDevice(AuthViewModel authViewModel, az azVar);

    public static final native /* synthetic */ void access$setCurrentPage$p(AuthViewModel authViewModel, int i4);

    public static final native /* synthetic */ void access$setLoading$p(AuthViewModel authViewModel, boolean z2);

    public static final native /* synthetic */ void access$trackShiftEndIfNeeded(AuthViewModel authViewModel, UserInfo userInfo);

    public static final native /* synthetic */ void access$trackShiftStartIfNeeded(AuthViewModel authViewModel, UserInfo userInfo);

    public static native /* synthetic */ void alpha(az azVar, AuthViewModel authViewModel, Task task);

    private final native String blockedByIntegrityMessage(String entryPoint);

    private final native void fetchCaptainInfo(az liveData, boolean isFinalCheck);

    private final native void fetchCaptainInfoAfterLogin();

    private final native void fetchFirebaseToken(az liveData);

    private static final native void fetchFirebaseToken$lambda$1(az azVar, AuthViewModel authViewModel, Task task);

    private final native Object fetchPlayIntegrityHeaders(String str, c cVar);

    private final native DataResponse getCachedCities();

    private final native DataResponse getCachedCountries();

    private final native boolean isCaptainMissing();

    private final native boolean isDeviceInfoMismatch();

    private final native boolean isDeviceVerificationChallenge(HttpException e);

    private final native boolean isFirebaseTokenMissing();

    private final native boolean isLocationPermissionMissing();

    private final native boolean isTerminal(UserIdentityRequestResponse resp);

    private final native boolean isTerminal(UserIdentityStatus status);

    private final native boolean isUUIDMissing();

    private final native void loadNationalitiesIfNeeded();

    private final native Object loginOnce(String str, String str2, String str3, String str4, String str5, c cVar);

    public static native /* synthetic */ Object loginOnce$default(AuthViewModel authViewModel, String str, String str2, String str3, String str4, String str5, c cVar, int i4, Object obj);

    private final native void piLog(String message);

    private final native void registerDevice(az liveData);

    public static native /* synthetic */ az signUp$default(AuthViewModel authViewModel, String str, String str2, String str3, String str4, int i4, String str5, String str6, String str7, int i5, int i10, String str8, String str9, String str10, String str11, Integer num, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, int i11, Object obj);

    public static native /* synthetic */ void startNafathPolling$default(AuthViewModel authViewModel, long j5, long j6, long j7, int i4, Object obj);

    private final native void trackShiftEndIfNeeded(UserInfo userInfo);

    private final native void trackShiftStartIfNeeded(UserInfo userInfo);

    private final native void updateDeviceInfo(az liveData);

    public static native /* synthetic */ boolean validateField$default(AuthViewModel authViewModel, TextInputLayout textInputLayout, Regex regex, Integer num, Context context, int i4, Object obj);

    public final native az changePassword(ChangePasswordRequest request);

    public final native void completeLoginAfterNafathVerified(UserInfo response);

    public final native void driverDraftMapper(SignUpRequest request, SignUpResponse response);

    public final native az getBanks();

    public final native DataResponse getCachedBanks();

    public final native List getCachedNationalities();

    public final native az getCities(int ofCountryId, int page);

    public final native void getCountries();

    public final native List getCountriesList();

    public final native az getCountriesLiveData();

    public final native aw getNafathError();

    public final native L getNafathState();

    public final native aw getNafathTerminal();

    public final native az getNationalities();

    public final native az getPlatformList();

    public final native az getPlatformListByCountryId(int id2);

    public final native az getPreferredVerticals();

    public final native L getSignInResponseState();

    public final native L getSignUpRequest();

    public final native az getSignUpRequestDetail(String forRequestId);

    public final native az getSignUpValidation();

    public final native L getUploadedDocument();

    public final native Object getUserIdentityRequest(long j5, c cVar);

    public final native boolean isCountriesLoading();

    public final native boolean isLastPage();

    public final native az onLogout();

    public final native void onSignIn(String email, String password);

    public final native List readNationalitiesFromAssets();

    public final native void resetCountriesPagination();

    public final native az resetPassword(ResetPasswordRequest request);

    public final native void setCachedNationalities(List list);

    public final native void setCountriesList(List list);

    public final native void setLastPage(boolean z2);

    public final native void setUploadDocument(Pair value);

    public final native az setup();

    public final native az signUp(String name, String idNumber, String dob, String preference, int preferredPlatformId, String vehiclePlateNumber, String vehicleSequenceNumber, String nationality, int countryId, int cityId, String mobileNo, String fintechId, String IBAN_name, String IBAN_no, Integer bankId, String referralCode, String idCardSnap, String drivingLicenseSnap, String vehicleRegistrationSnap, String profileSnap, String id2, String urPayAccountIban, String urPayIdNumber);

    public final native void startNafathPolling(long requestId, long periodMs, long timeoutMs);

    public final native void stopNafathPolling();

    public final native void updateRequest(Function1 updateBlock);

    public final native boolean validateField(TextInputLayout field, Regex regex, Integer errorMsg, Context context);
}
