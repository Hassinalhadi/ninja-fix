package I0;

import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import bx.C0769g;

/* loaded from: classes3.dex */
public class o implements InputConnection {
    public final C0769g alpha;
    public w.v bravo;

    public o(w.v vVar, C0769g c0769g) {
        this.alpha = c0769g;
        this.bravo = vVar;
    }

    public void alpha(w.v vVar) {
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        w.v vVar = this.bravo;
        if (vVar != null) {
            return vVar.beginBatchEdit();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i4) {
        w.v vVar = this.bravo;
        if (vVar != null) {
            return vVar.clearMetaKeyStates(i4);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        w.v vVar = this.bravo;
        if (vVar != null) {
            if (vVar != null) {
                alpha(vVar);
                this.bravo = null;
            }
            this.alpha.invoke(this);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        w.v vVar = this.bravo;
        if (vVar != null) {
            return vVar.commitCompletion(completionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitContent(InputContentInfo inputContentInfo, int i4, Bundle bundle) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        w.v vVar = this.bravo;
        if (vVar != null) {
            return vVar.commitCorrection(correctionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i4) {
        w.v vVar = this.bravo;
        if (vVar != null) {
            return vVar.commitText(charSequence, i4);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i4, int i5) {
        w.v vVar = this.bravo;
        if (vVar != null) {
            return vVar.deleteSurroundingText(i4, i5);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i4, int i5) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        w.v vVar = this.bravo;
        if (vVar != null) {
            return vVar.bravo();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        w.v vVar = this.bravo;
        if (vVar != null) {
            return vVar.finishComposingText();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i4) {
        w.v vVar = this.bravo;
        if (vVar != null) {
            return vVar.getCursorCapsMode(i4);
        }
        return 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i4) {
        w.v vVar = this.bravo;
        if (vVar != null) {
            return vVar.getExtractedText(extractedTextRequest, i4);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i4) {
        w.v vVar = this.bravo;
        if (vVar != null) {
            return vVar.getSelectedText(i4);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i4, int i5) {
        w.v vVar = this.bravo;
        if (vVar != null) {
            return vVar.getTextAfterCursor(i4, i5);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i4, int i5) {
        w.v vVar = this.bravo;
        if (vVar != null) {
            return vVar.getTextBeforeCursor(i4, i5);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i4) {
        w.v vVar = this.bravo;
        if (vVar != null) {
            return vVar.performContextMenuAction(i4);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i4) {
        w.v vVar = this.bravo;
        if (vVar != null) {
            return vVar.performEditorAction(i4);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        w.v vVar = this.bravo;
        if (vVar != null) {
            return vVar.performPrivateCommand(str, bundle);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z2) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i4) {
        w.v vVar = this.bravo;
        if (vVar != null) {
            return vVar.requestCursorUpdates(i4);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        w.v vVar = this.bravo;
        if (vVar != null) {
            return vVar.sendKeyEvent(keyEvent);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i4, int i5) {
        w.v vVar = this.bravo;
        if (vVar != null) {
            return vVar.setComposingRegion(i4, i5);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i4) {
        w.v vVar = this.bravo;
        if (vVar != null) {
            return vVar.setComposingText(charSequence, i4);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i4, int i5) {
        w.v vVar = this.bravo;
        if (vVar != null) {
            return vVar.setSelection(i4, i5);
        }
        return false;
    }
}
