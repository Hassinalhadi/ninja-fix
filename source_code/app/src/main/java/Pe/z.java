package Pe;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class z implements v {
    public static final /* synthetic */ ge.v[] ochre;
    public boolean alpha;
    public final x amber;
    public final x azure;
    public final x beige;
    public final x black;
    public final x blue;
    public final x bravo = new x(b.delta, this);
    public final x bronze;
    public final x charlie;
    public final x coral;
    public final x crimson;
    public final x cyan;
    public final x delta;
    public final x echo;
    public final x emerald;
    public final x foxtrot;
    public final x fuchsia;
    public final x gold;
    public final x golf;
    public final x gray;
    public final x green;
    public final x hotel;
    public final x india;
    public final x indigo;
    public final x ivory;
    public final x jade;
    public final x juliet;
    public final x kilo;
    public final x lavender;
    public final x lima;
    public final x lime;
    public final x magenta;
    public final x maroon;
    public final x mike;
    public final x navy;
    public final x november;
    public final x oscar;
    public final x papa;
    public final x quebec;
    public final x romeo;
    public final x sierra;
    public final x tango;
    public final x uniform;
    public final x victor;
    public final x whiskey;
    public final x xray;
    public final x yankee;
    public final x zulu;

    static {
        kotlin.jvm.internal.v vVar = kotlin.jvm.internal.u.alpha;
        ochre = new ge.v[]{vVar.foxtrot(new kotlin.jvm.internal.l(vVar.bravo(z.class), "classifierNamePolicy", "getClassifierNamePolicy()Lorg/jetbrains/kotlin/renderer/ClassifierNamePolicy;")), vVar.foxtrot(new kotlin.jvm.internal.l(vVar.bravo(z.class), "withDefinedIn", "getWithDefinedIn()Z")), vVar.foxtrot(new kotlin.jvm.internal.l(vVar.bravo(z.class), "withSourceFileForTopLevel", "getWithSourceFileForTopLevel()Z")), vVar.foxtrot(new kotlin.jvm.internal.l(vVar.bravo(z.class), "modifiers", "getModifiers()Ljava/util/Set;")), vVar.foxtrot(new kotlin.jvm.internal.l(vVar.bravo(z.class), "startFromName", "getStartFromName()Z")), vVar.foxtrot(new kotlin.jvm.internal.l(vVar.bravo(z.class), "startFromDeclarationKeyword", "getStartFromDeclarationKeyword()Z")), vVar.foxtrot(new kotlin.jvm.internal.l(vVar.bravo(z.class), "debugMode", "getDebugMode()Z")), vVar.foxtrot(new kotlin.jvm.internal.l(vVar.bravo(z.class), "classWithPrimaryConstructor", "getClassWithPrimaryConstructor()Z")), vVar.foxtrot(new kotlin.jvm.internal.l(vVar.bravo(z.class), "verbose", "getVerbose()Z")), vVar.foxtrot(new kotlin.jvm.internal.l(vVar.bravo(z.class), "unitReturnType", "getUnitReturnType()Z")), vVar.foxtrot(new kotlin.jvm.internal.l(vVar.bravo(z.class), "withoutReturnType", "getWithoutReturnType()Z")), vVar.foxtrot(new kotlin.jvm.internal.l(vVar.bravo(z.class), "enhancedTypes", "getEnhancedTypes()Z")), vVar.foxtrot(new kotlin.jvm.internal.l(vVar.bravo(z.class), "normalizedVisibilities", "getNormalizedVisibilities()Z")), vVar.foxtrot(new kotlin.jvm.internal.l(vVar.bravo(z.class), "renderDefaultVisibility", "getRenderDefaultVisibility()Z")), vVar.foxtrot(new kotlin.jvm.internal.l(vVar.bravo(z.class), "renderDefaultModality", "getRenderDefaultModality()Z")), vVar.foxtrot(new kotlin.jvm.internal.l(vVar.bravo(z.class), "renderConstructorDelegation", "getRenderConstructorDelegation()Z")), vVar.foxtrot(new kotlin.jvm.internal.l(vVar.bravo(z.class), "renderPrimaryConstructorParametersAsProperties", "getRenderPrimaryConstructorParametersAsProperties()Z")), vVar.foxtrot(new kotlin.jvm.internal.l(vVar.bravo(z.class), "actualPropertiesInPrimaryConstructor", "getActualPropertiesInPrimaryConstructor()Z")), vVar.foxtrot(new kotlin.jvm.internal.l(vVar.bravo(z.class), "uninferredTypeParameterAsName", "getUninferredTypeParameterAsName()Z")), vVar.foxtrot(new kotlin.jvm.internal.l(vVar.bravo(z.class), "includePropertyConstant", "getIncludePropertyConstant()Z")), vVar.foxtrot(new kotlin.jvm.internal.l(vVar.bravo(z.class), "withoutTypeParameters", "getWithoutTypeParameters()Z")), vVar.foxtrot(new kotlin.jvm.internal.l(vVar.bravo(z.class), "withoutSuperTypes", "getWithoutSuperTypes()Z")), vVar.foxtrot(new kotlin.jvm.internal.l(vVar.bravo(z.class), "typeNormalizer", "getTypeNormalizer()Lkotlin/jvm/functions/Function1;")), vVar.foxtrot(new kotlin.jvm.internal.l(vVar.bravo(z.class), "defaultParameterValueRenderer", "getDefaultParameterValueRenderer()Lkotlin/jvm/functions/Function1;")), vVar.foxtrot(new kotlin.jvm.internal.l(vVar.bravo(z.class), "secondaryConstructorsAsPrimary", "getSecondaryConstructorsAsPrimary()Z")), vVar.foxtrot(new kotlin.jvm.internal.l(vVar.bravo(z.class), "overrideRenderingPolicy", "getOverrideRenderingPolicy()Lorg/jetbrains/kotlin/renderer/OverrideRenderingPolicy;")), vVar.foxtrot(new kotlin.jvm.internal.l(vVar.bravo(z.class), "valueParametersHandler", "getValueParametersHandler()Lorg/jetbrains/kotlin/renderer/DescriptorRenderer$ValueParametersHandler;")), vVar.foxtrot(new kotlin.jvm.internal.l(vVar.bravo(z.class), "textFormat", "getTextFormat()Lorg/jetbrains/kotlin/renderer/RenderingFormat;")), vVar.foxtrot(new kotlin.jvm.internal.l(vVar.bravo(z.class), "parameterNameRenderingPolicy", "getParameterNameRenderingPolicy()Lorg/jetbrains/kotlin/renderer/ParameterNameRenderingPolicy;")), vVar.foxtrot(new kotlin.jvm.internal.l(vVar.bravo(z.class), "receiverAfterName", "getReceiverAfterName()Z")), vVar.foxtrot(new kotlin.jvm.internal.l(vVar.bravo(z.class), "renderCompanionObjectName", "getRenderCompanionObjectName()Z")), vVar.foxtrot(new kotlin.jvm.internal.l(vVar.bravo(z.class), "propertyAccessorRenderingPolicy", "getPropertyAccessorRenderingPolicy()Lorg/jetbrains/kotlin/renderer/PropertyAccessorRenderingPolicy;")), vVar.foxtrot(new kotlin.jvm.internal.l(vVar.bravo(z.class), "renderDefaultAnnotationArguments", "getRenderDefaultAnnotationArguments()Z")), vVar.foxtrot(new kotlin.jvm.internal.l(vVar.bravo(z.class), "eachAnnotationOnNewLine", "getEachAnnotationOnNewLine()Z")), vVar.foxtrot(new kotlin.jvm.internal.l(vVar.bravo(z.class), "excludedAnnotationClasses", "getExcludedAnnotationClasses()Ljava/util/Set;")), vVar.foxtrot(new kotlin.jvm.internal.l(vVar.bravo(z.class), "excludedTypeAnnotationClasses", "getExcludedTypeAnnotationClasses()Ljava/util/Set;")), vVar.foxtrot(new kotlin.jvm.internal.l(vVar.bravo(z.class), "annotationFilter", "getAnnotationFilter()Lkotlin/jvm/functions/Function1;")), vVar.foxtrot(new kotlin.jvm.internal.l(vVar.bravo(z.class), "annotationArgumentsRenderingPolicy", "getAnnotationArgumentsRenderingPolicy()Lorg/jetbrains/kotlin/renderer/AnnotationArgumentsRenderingPolicy;")), vVar.foxtrot(new kotlin.jvm.internal.l(vVar.bravo(z.class), "alwaysRenderModifiers", "getAlwaysRenderModifiers()Z")), vVar.foxtrot(new kotlin.jvm.internal.l(vVar.bravo(z.class), "renderConstructorKeyword", "getRenderConstructorKeyword()Z")), vVar.foxtrot(new kotlin.jvm.internal.l(vVar.bravo(z.class), "renderUnabbreviatedType", "getRenderUnabbreviatedType()Z")), vVar.foxtrot(new kotlin.jvm.internal.l(vVar.bravo(z.class), "renderTypeExpansions", "getRenderTypeExpansions()Z")), vVar.foxtrot(new kotlin.jvm.internal.l(vVar.bravo(z.class), "includeAdditionalModifiers", "getIncludeAdditionalModifiers()Z")), vVar.foxtrot(new kotlin.jvm.internal.l(vVar.bravo(z.class), "parameterNamesInFunctionalTypes", "getParameterNamesInFunctionalTypes()Z")), vVar.foxtrot(new kotlin.jvm.internal.l(vVar.bravo(z.class), "renderFunctionContracts", "getRenderFunctionContracts()Z")), vVar.foxtrot(new kotlin.jvm.internal.l(vVar.bravo(z.class), "presentableUnresolvedTypes", "getPresentableUnresolvedTypes()Z")), vVar.foxtrot(new kotlin.jvm.internal.l(vVar.bravo(z.class), "boldOnlyForNamesInHtml", "getBoldOnlyForNamesInHtml()Z")), vVar.foxtrot(new kotlin.jvm.internal.l(vVar.bravo(z.class), "informativeErrorType", "getInformativeErrorType()Z"))};
    }

    public z() {
        Boolean bool = Boolean.TRUE;
        this.charlie = new x(bool, this);
        this.delta = new x(bool, this);
        this.echo = new x(u.purple, this);
        Boolean bool2 = Boolean.FALSE;
        this.foxtrot = new x(bool2, this);
        this.golf = new x(bool2, this);
        this.hotel = new x(bool2, this);
        this.india = new x(bool2, this);
        this.juliet = new x(bool2, this);
        this.kilo = new x(bool, this);
        this.lima = new x(bool2, this);
        this.mike = new x(bool2, this);
        this.november = new x(bool2, this);
        this.oscar = new x(bool, this);
        this.papa = new x(bool, this);
        this.quebec = new x(bool2, this);
        this.romeo = new x(bool2, this);
        this.sierra = new x(bool2, this);
        this.tango = new x(bool2, this);
        this.uniform = new x(bool2, this);
        this.victor = new x(bool2, this);
        this.whiskey = new x(bool2, this);
        this.xray = new x(y.alpha, this);
        this.yankee = new x(w.alpha, this);
        this.zulu = new x(bool, this);
        this.amber = new x(ac.purple, this);
        this.azure = new x(n.alpha, this);
        this.beige = new x(ah.alpha, this);
        this.black = new x(ad.alpha, this);
        this.blue = new x(bool2, this);
        this.bronze = new x(bool2, this);
        this.coral = new x(ae.alpha, this);
        this.crimson = new x(bool2, this);
        this.cyan = new x(bool2, this);
        this.emerald = new x(kotlin.collections.u.alpha, this);
        this.fuchsia = new x(aa.alpha, this);
        this.gold = new x(null, this);
        this.gray = new x(a.NO_ARGUMENTS, this);
        this.green = new x(bool2, this);
        this.indigo = new x(bool, this);
        this.ivory = new x(bool, this);
        this.jade = new x(bool2, this);
        this.lavender = new x(bool, this);
        this.lime = new x(bool, this);
        this.magenta = new x(bool2, this);
        this.maroon = new x(bool2, this);
        this.navy = new x(bool, this);
    }

    @Override // Pe.v
    public final void alpha() {
        this.blue.bravo(ochre[29], Boolean.TRUE);
    }

    @Override // Pe.v
    public final void bravo() {
        this.hotel.bravo(ochre[6], Boolean.TRUE);
    }

    @Override // Pe.v
    public final void charlie() {
        this.bronze.bravo(ochre[30], Boolean.TRUE);
    }

    @Override // Pe.v
    public final void delta(Set set) {
        Intrinsics.echo(set, "<set-?>");
        this.echo.bravo(ochre[3], set);
    }

    @Override // Pe.v
    public final void echo(LinkedHashSet linkedHashSet) {
        this.fuchsia.bravo(ochre[35], linkedHashSet);
    }

    @Override // Pe.v
    public final void foxtrot() {
        this.victor.bravo(ochre[20], Boolean.TRUE);
    }

    @Override // Pe.v
    public final void golf(c cVar) {
        this.bravo.bravo(ochre[0], cVar);
    }

    @Override // Pe.v
    public final void hotel() {
        this.foxtrot.bravo(ochre[4], Boolean.TRUE);
    }

    @Override // Pe.v
    public final void india() {
        this.charlie.bravo(ochre[1], Boolean.FALSE);
    }

    @Override // Pe.v
    public final Set juliet() {
        return (Set) this.fuchsia.alpha(ochre[35], this);
    }

    @Override // Pe.v
    public final void kilo(ad adVar) {
        this.black.bravo(ochre[28], adVar);
    }

    @Override // Pe.v
    public final void lima() {
        af afVar = ah.purple;
        this.beige.bravo(ochre[27], afVar);
    }

    @Override // Pe.v
    public final void mike() {
        this.whiskey.bravo(ochre[21], Boolean.TRUE);
    }

    public final boolean november() {
        return ((Boolean) this.hotel.alpha(ochre[6], this)).booleanValue();
    }
}
