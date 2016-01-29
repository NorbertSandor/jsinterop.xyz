package xyz.jsinterop.client.dom;

/*
 * #%L
 * jsinterop
 * %%
 * Copyright (C) 2016 Norbert Sándor
 * %%
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 * #L%
 */

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public interface DocumentEvent {
	@JsOverlay
	public default AnimationEvent createEventAnimationEvent() {
		return (AnimationEvent) createEvent("AnimationEvent");
	}

	@JsOverlay
	public default AriaRequestEvent createEventAriaRequestEvent() {
		return (AriaRequestEvent) createEvent("AriaRequestEvent");
	}

	@JsOverlay
	public default AudioProcessingEvent createEventAudioProcessingEvent() {
		return (AudioProcessingEvent) createEvent("AudioProcessingEvent");
	}

	@JsOverlay
	public default BeforeUnloadEvent createEventBeforeUnloadEvent() {
		return (BeforeUnloadEvent) createEvent("BeforeUnloadEvent");
	}

	@JsOverlay
	public default ClipboardEvent createEventClipboardEvent() {
		return (ClipboardEvent) createEvent("ClipboardEvent");
	}

	@JsOverlay
	public default CloseEvent createEventCloseEvent() {
		return (CloseEvent) createEvent("CloseEvent");
	}

	@JsOverlay
	public default CommandEvent createEventCommandEvent() {
		return (CommandEvent) createEvent("CommandEvent");
	}

	@JsOverlay
	public default CompositionEvent createEventCompositionEvent() {
		return (CompositionEvent) createEvent("CompositionEvent");
	}

	@JsOverlay
	public default CustomEvent createEventCustomEvent() {
		return (CustomEvent) createEvent("CustomEvent");
	}

	@JsOverlay
	public default DeviceMotionEvent createEventDeviceMotionEvent() {
		return (DeviceMotionEvent) createEvent("DeviceMotionEvent");
	}

	@JsOverlay
	public default DeviceOrientationEvent createEventDeviceOrientationEvent() {
		return (DeviceOrientationEvent) createEvent("DeviceOrientationEvent");
	}

	@JsOverlay
	public default DragEvent createEventDragEvent() {
		return (DragEvent) createEvent("DragEvent");
	}

	@JsOverlay
	public default ErrorEvent createEventErrorEvent() {
		return (ErrorEvent) createEvent("ErrorEvent");
	}

	@JsOverlay
	public default Event createEventEvent() {
		return (Event) createEvent("Event");
	}

	@JsOverlay
	public default Event createEventEvents() {
		return (Event) createEvent("Events");
	}

	@JsOverlay
	public default FocusEvent createEventFocusEvent() {
		return (FocusEvent) createEvent("FocusEvent");
	}

	@JsOverlay
	public default GamepadEvent createEventGamepadEvent() {
		return (GamepadEvent) createEvent("GamepadEvent");
	}

	@JsOverlay
	public default HashChangeEvent createEventHashChangeEvent() {
		return (HashChangeEvent) createEvent("HashChangeEvent");
	}

	@JsOverlay
	public default IDBVersionChangeEvent createEventIDBVersionChangeEvent() {
		return (IDBVersionChangeEvent) createEvent("IDBVersionChangeEvent");
	}

	@JsOverlay
	public default KeyboardEvent createEventKeyboardEvent() {
		return (KeyboardEvent) createEvent("KeyboardEvent");
	}

	@JsOverlay
	public default LongRunningScriptDetectedEvent createEventLongRunningScriptDetectedEvent() {
		return (LongRunningScriptDetectedEvent) createEvent("LongRunningScriptDetectedEvent");
	}

	@JsOverlay
	public default MSGestureEvent createEventMSGestureEvent() {
		return (MSGestureEvent) createEvent("MSGestureEvent");
	}

	@JsOverlay
	public default MSManipulationEvent createEventMSManipulationEvent() {
		return (MSManipulationEvent) createEvent("MSManipulationEvent");
	}

	@JsOverlay
	public default MSMediaKeyMessageEvent createEventMSMediaKeyMessageEvent() {
		return (MSMediaKeyMessageEvent) createEvent("MSMediaKeyMessageEvent");
	}

	@JsOverlay
	public default MSMediaKeyNeededEvent createEventMSMediaKeyNeededEvent() {
		return (MSMediaKeyNeededEvent) createEvent("MSMediaKeyNeededEvent");
	}

	@JsOverlay
	public default MSPointerEvent createEventMSPointerEvent() {
		return (MSPointerEvent) createEvent("MSPointerEvent");
	}

	@JsOverlay
	public default MSSiteModeEvent createEventMSSiteModeEvent() {
		return (MSSiteModeEvent) createEvent("MSSiteModeEvent");
	}

	@JsOverlay
	public default MessageEvent createEventMessageEvent() {
		return (MessageEvent) createEvent("MessageEvent");
	}

	@JsOverlay
	public default MouseEvent createEventMouseEvent() {
		return (MouseEvent) createEvent("MouseEvent");
	}

	@JsOverlay
	public default MouseEvent createEventMouseEvents() {
		return (MouseEvent) createEvent("MouseEvents");
	}

	@JsOverlay
	public default MouseWheelEvent createEventMouseWheelEvent() {
		return (MouseWheelEvent) createEvent("MouseWheelEvent");
	}

	@JsOverlay
	public default MutationEvent createEventMutationEvent() {
		return (MutationEvent) createEvent("MutationEvent");
	}

	@JsOverlay
	public default MutationEvent createEventMutationEvents() {
		return (MutationEvent) createEvent("MutationEvents");
	}

	@JsOverlay
	public default NavigationCompletedEvent createEventNavigationCompletedEvent() {
		return (NavigationCompletedEvent) createEvent("NavigationCompletedEvent");
	}

	@JsOverlay
	public default NavigationEvent createEventNavigationEvent() {
		return (NavigationEvent) createEvent("NavigationEvent");
	}

	@JsOverlay
	public default NavigationEventWithReferrer createEventNavigationEventWithReferrer() {
		return (NavigationEventWithReferrer) createEvent("NavigationEventWithReferrer");
	}

	@JsOverlay
	public default OfflineAudioCompletionEvent createEventOfflineAudioCompletionEvent() {
		return (OfflineAudioCompletionEvent) createEvent("OfflineAudioCompletionEvent");
	}

	@JsOverlay
	public default PageTransitionEvent createEventPageTransitionEvent() {
		return (PageTransitionEvent) createEvent("PageTransitionEvent");
	}

	@JsOverlay
	public default PermissionRequestedEvent createEventPermissionRequestedEvent() {
		return (PermissionRequestedEvent) createEvent("PermissionRequestedEvent");
	}

	@JsOverlay
	public default PointerEvent createEventPointerEvent() {
		return (PointerEvent) createEvent("PointerEvent");
	}

	@JsOverlay
	public default PopStateEvent createEventPopStateEvent() {
		return (PopStateEvent) createEvent("PopStateEvent");
	}

	@JsOverlay
	public default ProgressEvent createEventProgressEvent() {
		return (ProgressEvent) createEvent("ProgressEvent");
	}

	@JsOverlay
	public default SVGZoomEvent createEventSVGZoomEvent() {
		return (SVGZoomEvent) createEvent("SVGZoomEvent");
	}

	@JsOverlay
	public default SVGZoomEvent createEventSVGZoomEvents() {
		return (SVGZoomEvent) createEvent("SVGZoomEvents");
	}

	@JsOverlay
	public default ScriptNotifyEvent createEventScriptNotifyEvent() {
		return (ScriptNotifyEvent) createEvent("ScriptNotifyEvent");
	}

	@JsOverlay
	public default StorageEvent createEventStorageEvent() {
		return (StorageEvent) createEvent("StorageEvent");
	}

	@JsOverlay
	public default TextEvent createEventTextEvent() {
		return (TextEvent) createEvent("TextEvent");
	}

	@JsOverlay
	public default TouchEvent createEventTouchEvent() {
		return (TouchEvent) createEvent("TouchEvent");
	}

	@JsOverlay
	public default TrackEvent createEventTrackEvent() {
		return (TrackEvent) createEvent("TrackEvent");
	}

	@JsOverlay
	public default TransitionEvent createEventTransitionEvent() {
		return (TransitionEvent) createEvent("TransitionEvent");
	}

	@JsOverlay
	public default UIEvent createEventUIEvent() {
		return (UIEvent) createEvent("UIEvent");
	}

	@JsOverlay
	public default UIEvent createEventUIEvents() {
		return (UIEvent) createEvent("UIEvents");
	}

	@JsOverlay
	public default UnviewableContentIdentifiedEvent createEventUnviewableContentIdentifiedEvent() {
		return (UnviewableContentIdentifiedEvent) createEvent("UnviewableContentIdentifiedEvent");
	}

	@JsOverlay
	public default WebGLContextEvent createEventWebGLContextEvent() {
		return (WebGLContextEvent) createEvent("WebGLContextEvent");
	}

	@JsOverlay
	public default WheelEvent createEventWheelEvent() {
		return (WheelEvent) createEvent("WheelEvent");
	}

	@JsMethod
	public abstract Event createEvent(final String eventInterface);
}
