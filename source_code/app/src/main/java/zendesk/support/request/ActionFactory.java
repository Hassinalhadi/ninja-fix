package zendesk.support.request;

import com.zendesk.service.ErrorResponse;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import r1.C2483b;
import zendesk.core.AuthenticationProvider;
import zendesk.core.Zendesk;
import zendesk.support.CommentsResponse;
import zendesk.support.Request;
import zendesk.support.RequestProvider;
import zendesk.support.SupportBlipsProvider;
import zendesk.support.SupportSettingsProvider;
import zendesk.support.SupportUiStorage;
import zendesk.support.UploadProvider;
import zendesk.support.request.ActionCreateComment;
import zendesk.support.suas.Action;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class ActionFactory {
    static final String ANDROID_ON_PAUSE = "ANDROID_ON_PAUSE";
    static final String ANDROID_ON_RESUME = "ANDROID_ON_RESUME";
    static final String ATTACHMENTS_DESELECTED = "ATTACHMENTS_DESELECTED";
    static final String ATTACHMENTS_SELECTED = "ATTACHMENTS_SELECTED";
    static final String ATTACHMENT_DOWNLOADED = "ATTACHMENT_DOWNLOADED";
    static final String CLEAR_ATTACHMENTS = "CLEAR_ATTACHMENTS";
    static final String CLEAR_MESSAGES = "CLEAR_MESSAGES";
    static final String CREATE_COMMENT = "CREATE_COMMENT";
    static final String CREATE_COMMENT_ERROR = "CREATE_COMMENT_ERROR";
    static final String CREATE_COMMENT_SUCCESS = "CREATE_COMMENT_SUCCESS";
    static final String CREATE_REQUEST = "CREATE_REQUEST";
    static final String CREATE_REQUEST_ERROR = "CREATE_REQUEST_ERROR";
    static final String CREATE_REQUEST_SUCCESS = "CREATE_REQUEST_SUCCESS";
    static final String DELETE_MESSAGE = "DELETE_MESSAGE";
    static final String DIALOG_DISMISSED = "DIALOG_DISMISSED";
    static final String LOAD_COMMENTS_FROM_CACHE = "LOAD_COMMENTS_FROM_CACHE";
    static final String LOAD_COMMENTS_FROM_CACHE_ERROR = "LOAD_COMMENTS_FROM_CACHE_ERROR";
    static final String LOAD_COMMENTS_FROM_CACHE_SUCCESS = "LOAD_COMMENTS_FROM_CACHE_SUCCESS";
    static final String LOAD_COMMENTS_INITIAL = "LOAD_COMMENT_INITIAL";
    static final String LOAD_COMMENTS_INITIAL_ERROR = "LOAD_COMMENTS_INITIAL_ERROR";
    static final String LOAD_COMMENTS_INITIAL_SUCCESS = "LOAD_COMMENTS_INITIAL_SUCCESS";
    static final String LOAD_COMMENTS_UPDATE = "LOAD_COMMENTS_UPDATE";
    static final String LOAD_COMMENTS_UPDATE_ERROR = "LOAD_COMMENTS_UPDATE_ERROR";
    static final String LOAD_COMMENTS_UPDATE_SUCCESS = "LOAD_COMMENTS_UPDATE_SUCCESS";
    static final String LOAD_REQUEST = "LOAD_REQUEST";
    static final String LOAD_REQUEST_ERROR = "LOAD_REQUEST_ERROR";
    static final String LOAD_REQUEST_SUCCESS = "LOAD_REQUEST_SUCCESS";
    static final String LOAD_SETTINGS = "LOAD_SETTINGS";
    static final String LOAD_SETTINGS_ERROR = "LOAD_SETTINGS_ERROR";
    static final String LOAD_SETTINGS_SUCCESS = "LOAD_SETTINGS_SUCCESS";
    static final String REQUEST_CLOSED = "REQUEST_CLOSED";
    static final String SHOW_RETRY_DIALOG = "SHOW_RETRY_DIALOG";
    static final String SKIP_ACTION = "SKIP_ACTION";
    static final String START_CONFIG = "START_CONFIG";
    private final AuthenticationProvider authProvider;
    private final Executor executorService;
    private final Executor mainThreadExecutor;
    private final MediaResultUtility mediaResultUtility;
    private final RequestProvider requestProvider;
    private final ResolveUri resolveUri;
    private final String sdkVersion;
    private final SupportSettingsProvider settingsProvider;
    private final SupportBlipsProvider supportBlipsProvider;
    private final SupportUiStorage supportUiStorage;
    private final UploadProvider uploadProvider;

    /* renamed from: zendesk, reason: collision with root package name */
    private final Zendesk f14263zendesk;

    /* loaded from: classes.dex */
    public static class ErrorAction<E> extends Action<E> {
        private final ErrorResponse errorResponse;

        public ErrorAction(String str, ErrorResponse errorResponse) {
            this(str, errorResponse, null);
        }

        public ErrorResponse getErrorResponse() {
            return this.errorResponse;
        }

        public ErrorAction(String str, ErrorResponse errorResponse, E e) {
            super(str, e);
            this.errorResponse = errorResponse;
        }
    }

    public ActionFactory(RequestProvider requestProvider, UploadProvider uploadProvider, SupportSettingsProvider supportSettingsProvider, SupportUiStorage supportUiStorage, Executor executor, String str, AuthenticationProvider authenticationProvider, Zendesk zendesk2, SupportBlipsProvider supportBlipsProvider, Executor executor2, MediaResultUtility mediaResultUtility, ResolveUri resolveUri) {
        this.requestProvider = requestProvider;
        this.uploadProvider = uploadProvider;
        this.settingsProvider = supportSettingsProvider;
        this.supportUiStorage = supportUiStorage;
        this.executorService = executor;
        this.mainThreadExecutor = executor2;
        this.sdkVersion = str;
        this.authProvider = authenticationProvider;
        this.f14263zendesk = zendesk2;
        this.supportBlipsProvider = supportBlipsProvider;
        this.mediaResultUtility = mediaResultUtility;
        this.resolveUri = resolveUri;
    }

    public Action androidOnPause() {
        return new Action(ANDROID_ON_PAUSE);
    }

    public Action androidOnResume() {
        return new Action(ANDROID_ON_RESUME);
    }

    public Action attachmentDownloaded(StateRequestAttachment stateRequestAttachment, MediaResult mediaResult) {
        return new Action(ATTACHMENT_DOWNLOADED, new C2483b(stateRequestAttachment, mediaResult));
    }

    public Action clearAttachments() {
        return new Action(CLEAR_ATTACHMENTS);
    }

    public Action clearMessages() {
        return new Action(CLEAR_MESSAGES);
    }

    public Action createComment(StateMessage stateMessage) {
        return new Action(CREATE_COMMENT, stateMessage);
    }

    public Action createCommentAsync(String str, List<StateRequestAttachment> list) {
        return AsyncMiddleware.createAction(new ActionCreateComment(this, this.requestProvider, new AttachmentUploadService(this.uploadProvider, list, this.mediaResultUtility, this.resolveUri), new StateMessage(str, list)));
    }

    public Action createCommentError(ErrorResponse errorResponse, StateMessage stateMessage) {
        return new ErrorAction(CREATE_COMMENT_ERROR, errorResponse, stateMessage);
    }

    public Action createCommentSuccess(ActionCreateComment.CreateCommentResult createCommentResult) {
        return new Action(CREATE_COMMENT_SUCCESS, createCommentResult);
    }

    public Action createRequestError(ErrorResponse errorResponse, StateMessage stateMessage) {
        return new ErrorAction(CREATE_REQUEST_ERROR, errorResponse, stateMessage);
    }

    public Action createRequestSuccess(ActionCreateComment.CreateCommentResult createCommentResult) {
        return new Action(CREATE_REQUEST_SUCCESS, createCommentResult);
    }

    public Action deleteMessage(StateMessage stateMessage) {
        return new Action(DELETE_MESSAGE, stateMessage);
    }

    public Action deselectAttachment(List<MediaResult> list) {
        return new Action(ATTACHMENTS_DESELECTED, list);
    }

    public Action initialLoadCommentsAsync() {
        return AsyncMiddleware.createAction(new ActionLoadComments(this, this.requestProvider, true, this.mediaResultUtility));
    }

    public Action installStartConfigAsync(RequestConfiguration requestConfiguration) {
        return AsyncMiddleware.createAction(new ActionInstallConfiguration(this.supportUiStorage, requestConfiguration, this.executorService, this.mainThreadExecutor, this, this.supportBlipsProvider));
    }

    public Action loadComments(boolean z2) {
        if (z2) {
            return new Action(LOAD_COMMENTS_INITIAL);
        }
        return new Action(LOAD_COMMENTS_UPDATE);
    }

    public Action loadCommentsError(boolean z2, ErrorResponse errorResponse) {
        if (z2) {
            return new ErrorAction(LOAD_COMMENTS_INITIAL_ERROR, errorResponse);
        }
        return new ErrorAction(LOAD_COMMENTS_UPDATE_ERROR, errorResponse);
    }

    public Action loadCommentsFromCache() {
        return new Action(LOAD_COMMENTS_FROM_CACHE);
    }

    public Action loadCommentsFromCacheAsync() {
        return AsyncMiddleware.createAction(new ActionLoadCachedComments(this, this.supportUiStorage, this.executorService, this.sdkVersion, this.mediaResultUtility));
    }

    public Action loadCommentsFromCacheError() {
        return new Action(LOAD_COMMENTS_FROM_CACHE_ERROR);
    }

    public Action loadCommentsFromCacheSuccess(StateConversation stateConversation) {
        return new Action(LOAD_COMMENTS_FROM_CACHE_SUCCESS, stateConversation);
    }

    public Action loadCommentsSuccess(boolean z2, CommentsResponse commentsResponse, Map<Long, MediaResult> map) {
        C2483b c2483b = new C2483b(commentsResponse, map);
        if (z2) {
            return new Action(LOAD_COMMENTS_INITIAL_SUCCESS, c2483b);
        }
        return new Action(LOAD_COMMENTS_UPDATE_SUCCESS, c2483b);
    }

    public Action loadRequest() {
        return new Action(LOAD_REQUEST);
    }

    public Action loadRequestAsync() {
        return AsyncMiddleware.createAction(new ActionLoadRequest(this, this.requestProvider));
    }

    public Action loadRequestError(ErrorResponse errorResponse) {
        return new ErrorAction(LOAD_REQUEST_ERROR, errorResponse);
    }

    public Action loadRequestSuccess(Request request) {
        return new Action(LOAD_REQUEST_SUCCESS, request);
    }

    public Action loadSettings() {
        return new Action(LOAD_SETTINGS);
    }

    public Action loadSettingsAsync() {
        return AsyncMiddleware.createAction(new ActionLoadSettings(this, this.settingsProvider, this.authProvider));
    }

    public Action loadSettingsError(ErrorResponse errorResponse) {
        return new ErrorAction(LOAD_SETTINGS_ERROR, errorResponse);
    }

    public Action loadSettingsSuccess(StateSettings stateSettings) {
        return new Action(LOAD_SETTINGS_SUCCESS, stateSettings);
    }

    public Action onDialogDismissed() {
        return new Action(DIALOG_DISMISSED);
    }

    public Action requestClosed() {
        return new Action(REQUEST_CLOSED);
    }

    public Action resendCommentAsync(StateMessage stateMessage) {
        return AsyncMiddleware.createAction(new ActionCreateComment(this, this.requestProvider, new AttachmentUploadService(this.uploadProvider, stateMessage.getAttachments(), this.mediaResultUtility, this.resolveUri), stateMessage));
    }

    public Action selectAttachment(List<MediaResult> list) {
        return new Action(ATTACHMENTS_SELECTED, list);
    }

    public Action showRetryDialog(List<StateMessage> list) {
        return new Action(SHOW_RETRY_DIALOG, list);
    }

    public Action skipAction() {
        return new Action(SKIP_ACTION);
    }

    public Action startConfig(RequestConfiguration requestConfiguration) {
        return new Action(START_CONFIG, requestConfiguration);
    }

    public Action updateCommentsAsync() {
        return AsyncMiddleware.createAction(new ActionLoadComments(this, this.requestProvider, false, this.mediaResultUtility));
    }

    public Action updateNameEmailAsync(String str, String str2) {
        return AsyncMiddleware.createAction(new ActionUpdateNameEmail(str, str2, this.authProvider, this.f14263zendesk));
    }
}
