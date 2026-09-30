package com.google.android.libraries.barhopper;

import com.google.android.apps.common.proguard.UsedByNative;

@UsedByNative("jni_common.cc")
/* loaded from: classes2.dex */
public class RecognitionOptions {

    @UsedByNative("jni_common.cc")
    private int barcodeFormats = 0;

    @UsedByNative("jni_common.cc")
    private boolean outputUnrecognizedBarcodes = false;

    @UsedByNative("jni_common.cc")
    private boolean useQrMobilenetV3 = false;

    @UsedByNative("jni_common.cc")
    private boolean enableQrAlignmentGrid = true;

    @UsedByNative("jni_common.cc")
    private boolean enableUseKeypointAsFinderPattern = true;

    @UsedByNative("jni_common.cc")
    private boolean useHalideAffineCrop = false;

    @UsedByNative("jni_common.cc")
    private MultiScaleDecodingOptions multiScaleDecodingOptions = new MultiScaleDecodingOptions();

    @UsedByNative("jni_common.cc")
    private MultiScaleDetectionOptions multiScaleDetectionOptions = new MultiScaleDetectionOptions();

    @UsedByNative("jni_common.cc")
    private OnedRecognitionOptions onedRecognitionOptions = new OnedRecognitionOptions();

    @UsedByNative("jni_common.cc")
    private boolean qrEnableFourthCornerApproximation = false;

    public final void alpha(int i4) {
        this.barcodeFormats = i4;
    }

    public final void bravo() {
        this.enableQrAlignmentGrid = true;
    }

    public final void charlie() {
        this.enableUseKeypointAsFinderPattern = true;
    }

    public final void delta(MultiScaleDecodingOptions multiScaleDecodingOptions) {
        this.multiScaleDecodingOptions = multiScaleDecodingOptions;
    }

    public final void echo(MultiScaleDetectionOptions multiScaleDetectionOptions) {
        this.multiScaleDetectionOptions = multiScaleDetectionOptions;
    }

    public final void foxtrot(boolean z2) {
        this.outputUnrecognizedBarcodes = z2;
    }

    public final void golf(boolean z2) {
        this.qrEnableFourthCornerApproximation = z2;
    }
}
