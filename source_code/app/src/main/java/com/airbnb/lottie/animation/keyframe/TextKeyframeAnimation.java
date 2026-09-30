package com.airbnb.lottie.animation.keyframe;

import com.airbnb.lottie.model.DocumentData;
import com.airbnb.lottie.value.Keyframe;
import com.airbnb.lottie.value.LottieFrameInfo;
import com.airbnb.lottie.value.LottieValueCallback;
import java.util.List;

/* loaded from: classes3.dex */
public class TextKeyframeAnimation extends KeyframeAnimation<DocumentData> {
    public TextKeyframeAnimation(List<Keyframe<DocumentData>> list) {
        super(list);
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    public /* bridge */ /* synthetic */ Object getValue(Keyframe keyframe, float f5) {
        return getValue((Keyframe<DocumentData>) keyframe, f5);
    }

    public void setStringValueCallback(final LottieValueCallback<String> lottieValueCallback) {
        final LottieFrameInfo lottieFrameInfo = new LottieFrameInfo();
        final DocumentData documentData = new DocumentData();
        super.setValueCallback(new LottieValueCallback<DocumentData>(this) { // from class: com.airbnb.lottie.animation.keyframe.TextKeyframeAnimation.1
            final /* synthetic */ TextKeyframeAnimation this$0;

            {
                this.this$0 = this;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.airbnb.lottie.value.LottieValueCallback
            public DocumentData getValue(LottieFrameInfo<DocumentData> lottieFrameInfo2) {
                lottieFrameInfo.set(lottieFrameInfo2.getStartFrame(), lottieFrameInfo2.getEndFrame(), lottieFrameInfo2.getStartValue().text, lottieFrameInfo2.getEndValue().text, lottieFrameInfo2.getLinearKeyframeProgress(), lottieFrameInfo2.getInterpolatedKeyframeProgress(), lottieFrameInfo2.getOverallProgress());
                String str = (String) lottieValueCallback.getValue(lottieFrameInfo);
                DocumentData endValue = lottieFrameInfo2.getInterpolatedKeyframeProgress() == 1.0f ? lottieFrameInfo2.getEndValue() : lottieFrameInfo2.getStartValue();
                documentData.set(str, endValue.fontName, endValue.size, endValue.justification, endValue.tracking, endValue.lineHeight, endValue.baselineShift, endValue.color, endValue.strokeColor, endValue.strokeWidth, endValue.strokeOverFill, endValue.boxPosition, endValue.boxSize);
                return documentData;
            }
        });
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    public DocumentData getValue(Keyframe<DocumentData> keyframe, float f5) {
        DocumentData documentData;
        LottieValueCallback<A> lottieValueCallback = this.valueCallback;
        if (lottieValueCallback == 0) {
            if (f5 == 1.0f && (documentData = keyframe.endValue) != null) {
                return documentData;
            }
            return keyframe.startValue;
        }
        float f10 = keyframe.startFrame;
        Float f11 = keyframe.endFrame;
        float floatValue = f11 == null ? Float.MAX_VALUE : f11.floatValue();
        DocumentData documentData2 = keyframe.startValue;
        DocumentData documentData3 = documentData2;
        DocumentData documentData4 = keyframe.endValue;
        return (DocumentData) lottieValueCallback.getValueInternal(f10, floatValue, documentData3, documentData4 == null ? documentData2 : documentData4, f5, getInterpolatedCurrentKeyframeProgress(), getProgress());
    }
}
