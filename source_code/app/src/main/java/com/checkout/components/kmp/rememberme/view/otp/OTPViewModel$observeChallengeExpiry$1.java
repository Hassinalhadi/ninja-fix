package com.checkout.components.kmp.rememberme.view.otp;

import A0.z;
import C1.t;
import Pd.e;
import Pd.i;
import Xd.l;
import av.q;
import com.checkout.components.kmp.rememberme.data.model.CreateChallengeResponse;
import com.checkout.components.kmp.rememberme.data.repositories.ChallengeRepository;
import com.checkout.components.kmp.rememberme.utils.ErrorCode;
import com.checkout.components.kmp.rememberme.utils.RememberMeError;
import com.google.android.gms.measurement.internal.C1471u;
import com.zendesk.service.HttpConstants;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.f;
import kotlin.time.g;
import kotlin.time.h;
import vf.H;
import vf.ab;
import vf.ad;
import vf.ao;
import xf.EnumC3340a;
import yf.AbstractC3428A;
import yf.InterfaceC3439i;
import yf.InterfaceC3440j;
import yf.ae;
import zf.n;
import zf.v;

@e(c = "com.checkout.components.kmp.rememberme.view.otp.OTPViewModel$observeChallengeExpiry$1", f = "OTPViewModel.kt", l = {175}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lvf/ab;", "", "<anonymous>", "(Lvf/ab;)V"}, k = 3, mv = {2, 2, 0})
/* loaded from: classes3.dex */
public final class OTPViewModel$observeChallengeExpiry$1 extends i implements l {
    int label;
    final /* synthetic */ OTPViewModel this$0;

    @e(c = "com.checkout.components.kmp.rememberme.view.otp.OTPViewModel$observeChallengeExpiry$1$1", f = "OTPViewModel.kt", l = {168}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\n"}, d2 = {"<anonymous>", "Lcom/checkout/components/kmp/rememberme/utils/RememberMeError;", "challenge", "Lcom/checkout/components/kmp/rememberme/data/model/CreateChallengeResponse;", "Lcom/checkout/components/kmp/rememberme/data/model/Challenge;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    /* renamed from: com.checkout.components.kmp.rememberme.view.otp.OTPViewModel$observeChallengeExpiry$1$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends i implements l {
        int I$0;
        long J$0;
        /* synthetic */ Object L$0;
        Object L$1;
        int label;

        public AnonymousClass1(Nd.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        @Override // Pd.a
        public final Nd.c<Unit> create(Object obj, Nd.c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // Xd.l
        public final Object invoke(CreateChallengeResponse createChallengeResponse, Nd.c<? super RememberMeError> cVar) {
            return ((AnonymousClass1) create(createChallengeResponse, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // Pd.a
        public final Object invokeSuspend(Object obj) {
            int i4;
            int i5;
            Od.a aVar;
            int i10;
            int i11;
            int i12;
            int i13;
            kotlin.time.i lima;
            boolean z2;
            int i14;
            int i15;
            long j5;
            int i16;
            char charAt;
            Long l10;
            int i17 = 4;
            int i18 = 10;
            CreateChallengeResponse createChallengeResponse = (CreateChallengeResponse) this.L$0;
            Od.a aVar2 = Od.a.alpha;
            int i19 = this.label;
            if (i19 != 0) {
                if (i19 == 1) {
                    ResultKt.alpha(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.alpha(obj);
                kotlin.time.e eVar = kotlin.time.e.red;
                String input = createChallengeResponse.getExpiresAt();
                Intrinsics.echo(input, "input");
                if (input.length() == 0) {
                    lima = new C1471u(11);
                } else {
                    char charAt2 = input.charAt(0);
                    if (charAt2 != '+' && charAt2 != '-') {
                        charAt2 = ' ';
                        i4 = 0;
                    } else {
                        i4 = 1;
                    }
                    int i20 = i4;
                    int i21 = 0;
                    int i22 = 6;
                    while (i20 < input.length() && '0' <= (charAt = input.charAt(i20)) && charAt < ':') {
                        i21 = (i21 * 10) + (input.charAt(i20) - '0');
                        i20++;
                    }
                    int i23 = i20 - i4;
                    if (i23 > 10) {
                        lima = g.lima(input, "Expected at most 10 digits for the year number, got " + i23 + " digits");
                    } else if (i23 == 10 && Intrinsics.golf(input.charAt(i4), 50) >= 0) {
                        lima = g.lima(input, "Expected at most 9 digits for the year number or year 1000000000, got " + i23 + " digits");
                    } else if (i23 < 4) {
                        lima = g.lima(input, "The year number must be padded to 4 digits, got " + i23 + " digits");
                    } else if (charAt2 == '+' && i23 == 4) {
                        lima = g.lima(input, "The '+' sign at the start is only valid for year numbers longer than 4 digits");
                    } else if (charAt2 == ' ' && i23 != 4) {
                        lima = g.lima(input, "A '+' or '-' sign is required for year numbers longer than 4 digits");
                    } else {
                        if (charAt2 == '-') {
                            i21 = -i21;
                        }
                        int i24 = i20 + 16;
                        if (input.length() < i24) {
                            lima = g.lima(input, "The input string is too short");
                        } else {
                            kotlin.time.i kilo = g.kilo(input, "'-'", i20, new kd.l(1));
                            if (kilo != null || (kilo = g.kilo(input, "'-'", i20 + 3, new kd.l(2))) != null || (kilo = g.kilo(input, "'T' or 't'", i20 + 6, new kd.l(3))) != null || (kilo = g.kilo(input, "':'", i20 + 9, new kd.l(4))) != null || (kilo = g.kilo(input, "':'", i20 + 12, new kd.l(5))) != null) {
                                lima = kilo;
                            } else {
                                int[] iArr = g.bravo;
                                int i25 = 0;
                                while (true) {
                                    if (i25 < 10) {
                                        int i26 = i17;
                                        kotlin.time.i kilo2 = g.kilo(input, "an ASCII digit", iArr[i25] + i20, new kd.l(i22));
                                        if (kilo2 != null) {
                                            lima = kilo2;
                                            break;
                                        }
                                        i25++;
                                        i17 = i26;
                                        i22 = 6;
                                    } else {
                                        int i27 = i17;
                                        int mike = g.mike(i20 + 1, input);
                                        int mike2 = g.mike(i20 + 4, input);
                                        int mike3 = g.mike(i20 + 7, input);
                                        int mike4 = g.mike(i20 + 10, input);
                                        int mike5 = g.mike(i20 + 13, input);
                                        int i28 = i20 + 15;
                                        if (input.charAt(i28) == '.') {
                                            i28 = i24;
                                            int i29 = 0;
                                            while (true) {
                                                if (i28 < input.length()) {
                                                    char charAt3 = input.charAt(i28);
                                                    i16 = i18;
                                                    if ('0' > charAt3 || charAt3 >= ':') {
                                                        break;
                                                    }
                                                    i29 = (i29 * 10) + (input.charAt(i28) - '0');
                                                    i28++;
                                                    i18 = i16;
                                                } else {
                                                    i16 = i18;
                                                    break;
                                                }
                                            }
                                            int i30 = i28 - i24;
                                            if (1 <= i30 && i30 < i16) {
                                                i5 = i29 * g.alpha[9 - i30];
                                            } else {
                                                lima = g.lima(input, "1..9 digits are supported for the fraction of the second, got " + i30 + " digits");
                                            }
                                        } else {
                                            i5 = 0;
                                        }
                                        if (i28 >= input.length()) {
                                            lima = g.lima(input, "The UTC offset at the end of the string is missing");
                                        } else {
                                            char charAt4 = input.charAt(i28);
                                            if (charAt4 != '+' && charAt4 != '-') {
                                                if (charAt4 != 'Z' && charAt4 != 'z') {
                                                    lima = g.lima(input, "Expected the UTC offset at position " + i28 + ", got '" + charAt4 + '\'');
                                                } else {
                                                    int i31 = i28 + 1;
                                                    if (input.length() == i31) {
                                                        aVar = aVar2;
                                                        i13 = 0;
                                                        if (1 > mike) {
                                                        }
                                                        lima = g.lima(input, "Expected a month number in 1..12, got " + mike);
                                                    } else {
                                                        lima = g.lima(input, "Extra text after the instant at position " + i31);
                                                    }
                                                }
                                            } else {
                                                int length = input.length() - i28;
                                                if (length > 9) {
                                                    lima = g.lima(input, "The UTC offset string \"" + g.romeo(16, input.subSequence(i28, input.length()).toString()) + "\" is too long");
                                                } else if (length % 3 != 0) {
                                                    lima = g.lima(input, "Invalid UTC offset string \"" + input.subSequence(i28, input.length()).toString() + '\"');
                                                } else {
                                                    int[] iArr2 = g.charlie;
                                                    int i32 = 0;
                                                    while (i32 < 2) {
                                                        int i33 = iArr2[i32] + i28;
                                                        int i34 = i32;
                                                        if (i33 >= input.length()) {
                                                            break;
                                                        }
                                                        aVar = aVar2;
                                                        if (input.charAt(i33) != ':') {
                                                            StringBuilder sierra = Q0.c.sierra(i33, "Expected ':' at index ", ", got '");
                                                            sierra.append(input.charAt(i33));
                                                            sierra.append('\'');
                                                            lima = g.lima(input, sierra.toString());
                                                            break;
                                                        }
                                                        i32 = i34 + 1;
                                                        aVar2 = aVar;
                                                    }
                                                    aVar = aVar2;
                                                    int[] iArr3 = g.delta;
                                                    int i35 = 0;
                                                    while (i35 < 6) {
                                                        int i36 = iArr3[i35] + i28;
                                                        int[] iArr4 = iArr3;
                                                        if (i36 >= input.length()) {
                                                            break;
                                                        }
                                                        char charAt5 = input.charAt(i36);
                                                        int i37 = i35;
                                                        if ('0' <= charAt5 && charAt5 < ':') {
                                                            i35 = i37 + 1;
                                                            iArr3 = iArr4;
                                                        } else {
                                                            StringBuilder sierra2 = Q0.c.sierra(i36, "Expected an ASCII digit at index ", ", got '");
                                                            sierra2.append(input.charAt(i36));
                                                            sierra2.append('\'');
                                                            lima = g.lima(input, sierra2.toString());
                                                            break;
                                                        }
                                                    }
                                                    int mike6 = g.mike(i28 + 1, input);
                                                    if (length > 3) {
                                                        i10 = g.mike(i28 + 4, input);
                                                    } else {
                                                        i10 = 0;
                                                    }
                                                    if (length > 6) {
                                                        i11 = g.mike(i28 + 7, input);
                                                    } else {
                                                        i11 = 0;
                                                    }
                                                    if (i10 > 59) {
                                                        lima = g.lima(input, "Expected offset-minute-of-hour in 0..59, got " + i10);
                                                    } else if (i11 > 59) {
                                                        lima = g.lima(input, "Expected offset-second-of-minute in 0..59, got " + i11);
                                                    } else if (mike6 > 17 && (mike6 != 18 || i10 != 0 || i11 != 0)) {
                                                        lima = g.lima(input, "Expected an offset in -18:00..+18:00, got " + input.subSequence(i28, input.length()).toString());
                                                    } else {
                                                        int foxtrot = z.foxtrot(i10, 60, mike6 * 3600, i11);
                                                        if (charAt4 == '-') {
                                                            i12 = -1;
                                                        } else {
                                                            i12 = 1;
                                                        }
                                                        i13 = foxtrot * i12;
                                                        if (1 > mike && mike < 13) {
                                                            if (1 <= mike2) {
                                                                int i38 = i21 & 3;
                                                                if (i38 == 0 && (i21 % 100 != 0 || i21 % HttpConstants.HTTP_BAD_REQUEST == 0)) {
                                                                    z2 = true;
                                                                } else {
                                                                    z2 = false;
                                                                }
                                                                if (mike != 2) {
                                                                    if (mike != i27 && mike != 6 && mike != 9 && mike != 11) {
                                                                        i14 = 31;
                                                                    } else {
                                                                        i14 = 30;
                                                                    }
                                                                } else if (z2) {
                                                                    i14 = 29;
                                                                } else {
                                                                    i14 = 28;
                                                                }
                                                                if (mike2 <= i14) {
                                                                    if (mike3 > 23) {
                                                                        lima = g.lima(input, "Expected hour in 0..23, got " + mike3);
                                                                    } else if (mike4 > 59) {
                                                                        lima = g.lima(input, "Expected minute-of-hour in 0..59, got " + mike4);
                                                                    } else if (mike5 > 59) {
                                                                        lima = g.lima(input, "Expected second-of-minute in 0..59, got " + mike5);
                                                                    } else {
                                                                        long j6 = i21;
                                                                        long j7 = 365 * j6;
                                                                        if (j6 >= 0) {
                                                                            i15 = i38;
                                                                            j5 = ((j6 + 399) / HttpConstants.HTTP_BAD_REQUEST) + (((3 + j6) / 4) - ((99 + j6) / 100)) + j7;
                                                                        } else {
                                                                            i15 = i38;
                                                                            j5 = j7 - ((j6 / (-400)) + ((j6 / (-4)) - (j6 / (-100))));
                                                                        }
                                                                        long j10 = j5 + (((mike * 367) - 362) / 12) + (mike2 - 1);
                                                                        if (mike > 2) {
                                                                            long j11 = (-1) + j10;
                                                                            if (i15 == 0 && (i21 % 100 != 0 || i21 % HttpConstants.HTTP_BAD_REQUEST == 0)) {
                                                                                j10 = j11;
                                                                            } else {
                                                                                j10 -= 2;
                                                                            }
                                                                        }
                                                                        lima = new h((((j10 - 719528) * 86400) + z.foxtrot(mike4, 60, mike3 * 3600, mike5)) - i13, i5);
                                                                    }
                                                                }
                                                            }
                                                            StringBuilder hotel = q.hotel(mike, i21, "Expected a valid day-of-month for month ", " of year ", ", got ");
                                                            hotel.append(mike2);
                                                            lima = g.lima(input, hotel.toString());
                                                        } else {
                                                            lima = g.lima(input, "Expected a month number in 1..12, got " + mike);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                aVar = aVar2;
                kotlin.time.e alpha = lima.alpha();
                if (alpha != null) {
                    kotlin.time.e other = f.alpha.golf();
                    Intrinsics.echo(other, "other");
                    int i39 = kotlin.time.b.silver;
                    l10 = new Long(kotlin.time.b.charlie(kotlin.time.b.foxtrot(g.quebec(alpha.alpha - other.alpha, kotlin.time.d.teal), g.papa(alpha.purple - other.purple, kotlin.time.d.purple))));
                } else {
                    l10 = null;
                }
                if (l10 == null) {
                    return null;
                }
                long longValue = l10.longValue();
                if (l10.longValue() > 0) {
                    long longValue2 = l10.longValue();
                    this.L$0 = null;
                    this.L$1 = null;
                    this.J$0 = longValue;
                    this.I$0 = 0;
                    this.label = 1;
                    Od.a aVar3 = aVar;
                    if (ad.november(longValue2, this) == aVar3) {
                        return aVar3;
                    }
                }
            }
            return new RememberMeError(ErrorCode.OTP_EXPIRED);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OTPViewModel$observeChallengeExpiry$1(OTPViewModel oTPViewModel, Nd.c<? super OTPViewModel$observeChallengeExpiry$1> cVar) {
        super(2, cVar);
        this.this$0 = oTPViewModel;
    }

    @Override // Pd.a
    public final Nd.c<Unit> create(Object obj, Nd.c<?> cVar) {
        return new OTPViewModel$observeChallengeExpiry$1(this.this$0, cVar);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        ChallengeRepository challengeRepository;
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
            challengeRepository = this.this$0.challengeRepository;
            InterfaceC3439i lima = AbstractC3428A.lima(new t(6, challengeRepository.getChallenge()));
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
            int i5 = ae.alpha;
            cd.a aVar2 = new cd.a(anonymousClass1, (Nd.c) null);
            Nd.i iVar = Nd.i.alpha;
            InterfaceC3439i tVar = new t(6, new n(aVar2, lima, iVar, -2, EnumC3340a.alpha));
            Cf.e eVar = ao.alpha;
            if (eVar.get(H.alpha) == null) {
                if (!Intrinsics.areEqual(eVar, iVar)) {
                    if (tVar instanceof v) {
                        tVar = zf.b.bravo((v) tVar, eVar, 0, null, 6);
                    } else {
                        tVar = new zf.i(tVar, eVar, 0, null, 12);
                    }
                }
                final OTPViewModel oTPViewModel = this.this$0;
                InterfaceC3440j interfaceC3440j = new InterfaceC3440j() { // from class: com.checkout.components.kmp.rememberme.view.otp.OTPViewModel$observeChallengeExpiry$1.2
                    public final Object emit(RememberMeError rememberMeError, Nd.c<? super Unit> cVar) {
                        OTPViewModel.this.handleRememberError$rememberme_release(rememberMeError);
                        return Unit.INSTANCE;
                    }

                    @Override // yf.InterfaceC3440j
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Nd.c cVar) {
                        return emit((RememberMeError) obj2, (Nd.c<? super Unit>) cVar);
                    }
                };
                this.label = 1;
                if (tVar.collect(interfaceC3440j, this) == aVar) {
                    return aVar;
                }
            } else {
                throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + eVar).toString());
            }
        }
        return Unit.INSTANCE;
    }

    @Override // Xd.l
    public final Object invoke(ab abVar, Nd.c<? super Unit> cVar) {
        return ((OTPViewModel$observeChallengeExpiry$1) create(abVar, cVar)).invokeSuspend(Unit.INSTANCE);
    }
}
