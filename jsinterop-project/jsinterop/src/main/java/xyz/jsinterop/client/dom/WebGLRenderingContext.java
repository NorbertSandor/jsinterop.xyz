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
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import xyz.jsinterop.client.core.ArrayBufferView;
import xyz.jsinterop.client.core.Float32Array;
import xyz.jsinterop.client.core.Int32Array;

@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public interface WebGLRenderingContext {
	@JsProperty
	public abstract HTMLCanvasElement getCanvas();

	@JsProperty
	public abstract void setCanvas(final HTMLCanvasElement value);

	@JsProperty
	public abstract double getDrawingBufferHeight();

	@JsProperty
	public abstract void setDrawingBufferHeight(final double value);

	@JsProperty
	public abstract double getDrawingBufferWidth();

	@JsProperty
	public abstract void setDrawingBufferWidth(final double value);

	@JsProperty
	public abstract double getACTIVE_ATTRIBUTES();

	@JsProperty
	public abstract void setACTIVE_ATTRIBUTES(final double value);

	@JsProperty
	public abstract double getACTIVE_TEXTURE();

	@JsProperty
	public abstract void setACTIVE_TEXTURE(final double value);

	@JsProperty
	public abstract double getACTIVE_UNIFORMS();

	@JsProperty
	public abstract void setACTIVE_UNIFORMS(final double value);

	@JsProperty
	public abstract double getALIASED_LINE_WIDTH_RANGE();

	@JsProperty
	public abstract void setALIASED_LINE_WIDTH_RANGE(final double value);

	@JsProperty
	public abstract double getALIASED_POINT_SIZE_RANGE();

	@JsProperty
	public abstract void setALIASED_POINT_SIZE_RANGE(final double value);

	@JsProperty
	public abstract double getALPHA();

	@JsProperty
	public abstract void setALPHA(final double value);

	@JsProperty
	public abstract double getALPHA_BITS();

	@JsProperty
	public abstract void setALPHA_BITS(final double value);

	@JsProperty
	public abstract double getALWAYS();

	@JsProperty
	public abstract void setALWAYS(final double value);

	@JsProperty
	public abstract double getARRAY_BUFFER();

	@JsProperty
	public abstract void setARRAY_BUFFER(final double value);

	@JsProperty
	public abstract double getARRAY_BUFFER_BINDING();

	@JsProperty
	public abstract void setARRAY_BUFFER_BINDING(final double value);

	@JsProperty
	public abstract double getATTACHED_SHADERS();

	@JsProperty
	public abstract void setATTACHED_SHADERS(final double value);

	@JsProperty
	public abstract double getBACK();

	@JsProperty
	public abstract void setBACK(final double value);

	@JsProperty
	public abstract double getBLEND();

	@JsProperty
	public abstract void setBLEND(final double value);

	@JsProperty
	public abstract double getBLEND_COLOR();

	@JsProperty
	public abstract void setBLEND_COLOR(final double value);

	@JsProperty
	public abstract double getBLEND_DST_ALPHA();

	@JsProperty
	public abstract void setBLEND_DST_ALPHA(final double value);

	@JsProperty
	public abstract double getBLEND_DST_RGB();

	@JsProperty
	public abstract void setBLEND_DST_RGB(final double value);

	@JsProperty
	public abstract double getBLEND_EQUATION();

	@JsProperty
	public abstract void setBLEND_EQUATION(final double value);

	@JsProperty
	public abstract double getBLEND_EQUATION_ALPHA();

	@JsProperty
	public abstract void setBLEND_EQUATION_ALPHA(final double value);

	@JsProperty
	public abstract double getBLEND_EQUATION_RGB();

	@JsProperty
	public abstract void setBLEND_EQUATION_RGB(final double value);

	@JsProperty
	public abstract double getBLEND_SRC_ALPHA();

	@JsProperty
	public abstract void setBLEND_SRC_ALPHA(final double value);

	@JsProperty
	public abstract double getBLEND_SRC_RGB();

	@JsProperty
	public abstract void setBLEND_SRC_RGB(final double value);

	@JsProperty
	public abstract double getBLUE_BITS();

	@JsProperty
	public abstract void setBLUE_BITS(final double value);

	@JsProperty
	public abstract double getBOOL();

	@JsProperty
	public abstract void setBOOL(final double value);

	@JsProperty
	public abstract double getBOOL_VEC2();

	@JsProperty
	public abstract void setBOOL_VEC2(final double value);

	@JsProperty
	public abstract double getBOOL_VEC3();

	@JsProperty
	public abstract void setBOOL_VEC3(final double value);

	@JsProperty
	public abstract double getBOOL_VEC4();

	@JsProperty
	public abstract void setBOOL_VEC4(final double value);

	@JsProperty
	public abstract double getBROWSER_DEFAULT_WEBGL();

	@JsProperty
	public abstract void setBROWSER_DEFAULT_WEBGL(final double value);

	@JsProperty
	public abstract double getBUFFER_SIZE();

	@JsProperty
	public abstract void setBUFFER_SIZE(final double value);

	@JsProperty
	public abstract double getBUFFER_USAGE();

	@JsProperty
	public abstract void setBUFFER_USAGE(final double value);

	@JsProperty
	public abstract double getBYTE();

	@JsProperty
	public abstract void setBYTE(final double value);

	@JsProperty
	public abstract double getCCW();

	@JsProperty
	public abstract void setCCW(final double value);

	@JsProperty
	public abstract double getCLAMP_TO_EDGE();

	@JsProperty
	public abstract void setCLAMP_TO_EDGE(final double value);

	@JsProperty
	public abstract double getCOLOR_ATTACHMENT0();

	@JsProperty
	public abstract void setCOLOR_ATTACHMENT0(final double value);

	@JsProperty
	public abstract double getCOLOR_BUFFER_BIT();

	@JsProperty
	public abstract void setCOLOR_BUFFER_BIT(final double value);

	@JsProperty
	public abstract double getCOLOR_CLEAR_VALUE();

	@JsProperty
	public abstract void setCOLOR_CLEAR_VALUE(final double value);

	@JsProperty
	public abstract double getCOLOR_WRITEMASK();

	@JsProperty
	public abstract void setCOLOR_WRITEMASK(final double value);

	@JsProperty
	public abstract double getCOMPILE_STATUS();

	@JsProperty
	public abstract void setCOMPILE_STATUS(final double value);

	@JsProperty
	public abstract double getCOMPRESSED_TEXTURE_FORMATS();

	@JsProperty
	public abstract void setCOMPRESSED_TEXTURE_FORMATS(final double value);

	@JsProperty
	public abstract double getCONSTANT_ALPHA();

	@JsProperty
	public abstract void setCONSTANT_ALPHA(final double value);

	@JsProperty
	public abstract double getCONSTANT_COLOR();

	@JsProperty
	public abstract void setCONSTANT_COLOR(final double value);

	@JsProperty
	public abstract double getCONTEXT_LOST_WEBGL();

	@JsProperty
	public abstract void setCONTEXT_LOST_WEBGL(final double value);

	@JsProperty
	public abstract double getCULL_FACE();

	@JsProperty
	public abstract void setCULL_FACE(final double value);

	@JsProperty
	public abstract double getCULL_FACE_MODE();

	@JsProperty
	public abstract void setCULL_FACE_MODE(final double value);

	@JsProperty
	public abstract double getCURRENT_PROGRAM();

	@JsProperty
	public abstract void setCURRENT_PROGRAM(final double value);

	@JsProperty
	public abstract double getCURRENT_VERTEX_ATTRIB();

	@JsProperty
	public abstract void setCURRENT_VERTEX_ATTRIB(final double value);

	@JsProperty
	public abstract double getCW();

	@JsProperty
	public abstract void setCW(final double value);

	@JsProperty
	public abstract double getDECR();

	@JsProperty
	public abstract void setDECR(final double value);

	@JsProperty
	public abstract double getDECR_WRAP();

	@JsProperty
	public abstract void setDECR_WRAP(final double value);

	@JsProperty
	public abstract double getDELETE_STATUS();

	@JsProperty
	public abstract void setDELETE_STATUS(final double value);

	@JsProperty
	public abstract double getDEPTH_ATTACHMENT();

	@JsProperty
	public abstract void setDEPTH_ATTACHMENT(final double value);

	@JsProperty
	public abstract double getDEPTH_BITS();

	@JsProperty
	public abstract void setDEPTH_BITS(final double value);

	@JsProperty
	public abstract double getDEPTH_BUFFER_BIT();

	@JsProperty
	public abstract void setDEPTH_BUFFER_BIT(final double value);

	@JsProperty
	public abstract double getDEPTH_CLEAR_VALUE();

	@JsProperty
	public abstract void setDEPTH_CLEAR_VALUE(final double value);

	@JsProperty
	public abstract double getDEPTH_COMPONENT();

	@JsProperty
	public abstract void setDEPTH_COMPONENT(final double value);

	@JsProperty
	public abstract double getDEPTH_COMPONENT16();

	@JsProperty
	public abstract void setDEPTH_COMPONENT16(final double value);

	@JsProperty
	public abstract double getDEPTH_FUNC();

	@JsProperty
	public abstract void setDEPTH_FUNC(final double value);

	@JsProperty
	public abstract double getDEPTH_RANGE();

	@JsProperty
	public abstract void setDEPTH_RANGE(final double value);

	@JsProperty
	public abstract double getDEPTH_STENCIL();

	@JsProperty
	public abstract void setDEPTH_STENCIL(final double value);

	@JsProperty
	public abstract double getDEPTH_STENCIL_ATTACHMENT();

	@JsProperty
	public abstract void setDEPTH_STENCIL_ATTACHMENT(final double value);

	@JsProperty
	public abstract double getDEPTH_TEST();

	@JsProperty
	public abstract void setDEPTH_TEST(final double value);

	@JsProperty
	public abstract double getDEPTH_WRITEMASK();

	@JsProperty
	public abstract void setDEPTH_WRITEMASK(final double value);

	@JsProperty
	public abstract double getDITHER();

	@JsProperty
	public abstract void setDITHER(final double value);

	@JsProperty
	public abstract double getDONT_CARE();

	@JsProperty
	public abstract void setDONT_CARE(final double value);

	@JsProperty
	public abstract double getDST_ALPHA();

	@JsProperty
	public abstract void setDST_ALPHA(final double value);

	@JsProperty
	public abstract double getDST_COLOR();

	@JsProperty
	public abstract void setDST_COLOR(final double value);

	@JsProperty
	public abstract double getDYNAMIC_DRAW();

	@JsProperty
	public abstract void setDYNAMIC_DRAW(final double value);

	@JsProperty
	public abstract double getELEMENT_ARRAY_BUFFER();

	@JsProperty
	public abstract void setELEMENT_ARRAY_BUFFER(final double value);

	@JsProperty
	public abstract double getELEMENT_ARRAY_BUFFER_BINDING();

	@JsProperty
	public abstract void setELEMENT_ARRAY_BUFFER_BINDING(final double value);

	@JsProperty
	public abstract double getEQUAL();

	@JsProperty
	public abstract void setEQUAL(final double value);

	@JsProperty
	public abstract double getFASTEST();

	@JsProperty
	public abstract void setFASTEST(final double value);

	@JsProperty
	public abstract double getFLOAT();

	@JsProperty
	public abstract void setFLOAT(final double value);

	@JsProperty
	public abstract double getFLOAT_MAT2();

	@JsProperty
	public abstract void setFLOAT_MAT2(final double value);

	@JsProperty
	public abstract double getFLOAT_MAT3();

	@JsProperty
	public abstract void setFLOAT_MAT3(final double value);

	@JsProperty
	public abstract double getFLOAT_MAT4();

	@JsProperty
	public abstract void setFLOAT_MAT4(final double value);

	@JsProperty
	public abstract double getFLOAT_VEC2();

	@JsProperty
	public abstract void setFLOAT_VEC2(final double value);

	@JsProperty
	public abstract double getFLOAT_VEC3();

	@JsProperty
	public abstract void setFLOAT_VEC3(final double value);

	@JsProperty
	public abstract double getFLOAT_VEC4();

	@JsProperty
	public abstract void setFLOAT_VEC4(final double value);

	@JsProperty
	public abstract double getFRAGMENT_SHADER();

	@JsProperty
	public abstract void setFRAGMENT_SHADER(final double value);

	@JsProperty
	public abstract double getFRAMEBUFFER();

	@JsProperty
	public abstract void setFRAMEBUFFER(final double value);

	@JsProperty
	public abstract double getFRAMEBUFFER_ATTACHMENT_OBJECT_NAME();

	@JsProperty
	public abstract void setFRAMEBUFFER_ATTACHMENT_OBJECT_NAME(final double value);

	@JsProperty
	public abstract double getFRAMEBUFFER_ATTACHMENT_OBJECT_TYPE();

	@JsProperty
	public abstract void setFRAMEBUFFER_ATTACHMENT_OBJECT_TYPE(final double value);

	@JsProperty
	public abstract double getFRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE();

	@JsProperty
	public abstract void setFRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE(final double value);

	@JsProperty
	public abstract double getFRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL();

	@JsProperty
	public abstract void setFRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL(final double value);

	@JsProperty
	public abstract double getFRAMEBUFFER_BINDING();

	@JsProperty
	public abstract void setFRAMEBUFFER_BINDING(final double value);

	@JsProperty
	public abstract double getFRAMEBUFFER_COMPLETE();

	@JsProperty
	public abstract void setFRAMEBUFFER_COMPLETE(final double value);

	@JsProperty
	public abstract double getFRAMEBUFFER_INCOMPLETE_ATTACHMENT();

	@JsProperty
	public abstract void setFRAMEBUFFER_INCOMPLETE_ATTACHMENT(final double value);

	@JsProperty
	public abstract double getFRAMEBUFFER_INCOMPLETE_DIMENSIONS();

	@JsProperty
	public abstract void setFRAMEBUFFER_INCOMPLETE_DIMENSIONS(final double value);

	@JsProperty
	public abstract double getFRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT();

	@JsProperty
	public abstract void setFRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT(final double value);

	@JsProperty
	public abstract double getFRAMEBUFFER_UNSUPPORTED();

	@JsProperty
	public abstract void setFRAMEBUFFER_UNSUPPORTED(final double value);

	@JsProperty
	public abstract double getFRONT();

	@JsProperty
	public abstract void setFRONT(final double value);

	@JsProperty
	public abstract double getFRONT_AND_BACK();

	@JsProperty
	public abstract void setFRONT_AND_BACK(final double value);

	@JsProperty
	public abstract double getFRONT_FACE();

	@JsProperty
	public abstract void setFRONT_FACE(final double value);

	@JsProperty
	public abstract double getFUNC_ADD();

	@JsProperty
	public abstract void setFUNC_ADD(final double value);

	@JsProperty
	public abstract double getFUNC_REVERSE_SUBTRACT();

	@JsProperty
	public abstract void setFUNC_REVERSE_SUBTRACT(final double value);

	@JsProperty
	public abstract double getFUNC_SUBTRACT();

	@JsProperty
	public abstract void setFUNC_SUBTRACT(final double value);

	@JsProperty
	public abstract double getGENERATE_MIPMAP_HINT();

	@JsProperty
	public abstract void setGENERATE_MIPMAP_HINT(final double value);

	@JsProperty
	public abstract double getGEQUAL();

	@JsProperty
	public abstract void setGEQUAL(final double value);

	@JsProperty
	public abstract double getGREATER();

	@JsProperty
	public abstract void setGREATER(final double value);

	@JsProperty
	public abstract double getGREEN_BITS();

	@JsProperty
	public abstract void setGREEN_BITS(final double value);

	@JsProperty
	public abstract double getHIGH_FLOAT();

	@JsProperty
	public abstract void setHIGH_FLOAT(final double value);

	@JsProperty
	public abstract double getHIGH_INT();

	@JsProperty
	public abstract void setHIGH_INT(final double value);

	@JsProperty
	public abstract double getIMPLEMENTATION_COLOR_READ_FORMAT();

	@JsProperty
	public abstract void setIMPLEMENTATION_COLOR_READ_FORMAT(final double value);

	@JsProperty
	public abstract double getIMPLEMENTATION_COLOR_READ_TYPE();

	@JsProperty
	public abstract void setIMPLEMENTATION_COLOR_READ_TYPE(final double value);

	@JsProperty
	public abstract double getINCR();

	@JsProperty
	public abstract void setINCR(final double value);

	@JsProperty
	public abstract double getINCR_WRAP();

	@JsProperty
	public abstract void setINCR_WRAP(final double value);

	@JsProperty
	public abstract double getINT();

	@JsProperty
	public abstract void setINT(final double value);

	@JsProperty
	public abstract double getINT_VEC2();

	@JsProperty
	public abstract void setINT_VEC2(final double value);

	@JsProperty
	public abstract double getINT_VEC3();

	@JsProperty
	public abstract void setINT_VEC3(final double value);

	@JsProperty
	public abstract double getINT_VEC4();

	@JsProperty
	public abstract void setINT_VEC4(final double value);

	@JsProperty
	public abstract double getINVALID_ENUM();

	@JsProperty
	public abstract void setINVALID_ENUM(final double value);

	@JsProperty
	public abstract double getINVALID_FRAMEBUFFER_OPERATION();

	@JsProperty
	public abstract void setINVALID_FRAMEBUFFER_OPERATION(final double value);

	@JsProperty
	public abstract double getINVALID_OPERATION();

	@JsProperty
	public abstract void setINVALID_OPERATION(final double value);

	@JsProperty
	public abstract double getINVALID_VALUE();

	@JsProperty
	public abstract void setINVALID_VALUE(final double value);

	@JsProperty
	public abstract double getINVERT();

	@JsProperty
	public abstract void setINVERT(final double value);

	@JsProperty
	public abstract double getKEEP();

	@JsProperty
	public abstract void setKEEP(final double value);

	@JsProperty
	public abstract double getLEQUAL();

	@JsProperty
	public abstract void setLEQUAL(final double value);

	@JsProperty
	public abstract double getLESS();

	@JsProperty
	public abstract void setLESS(final double value);

	@JsProperty
	public abstract double getLINEAR();

	@JsProperty
	public abstract void setLINEAR(final double value);

	@JsProperty
	public abstract double getLINEAR_MIPMAP_LINEAR();

	@JsProperty
	public abstract void setLINEAR_MIPMAP_LINEAR(final double value);

	@JsProperty
	public abstract double getLINEAR_MIPMAP_NEAREST();

	@JsProperty
	public abstract void setLINEAR_MIPMAP_NEAREST(final double value);

	@JsProperty
	public abstract double getLINES();

	@JsProperty
	public abstract void setLINES(final double value);

	@JsProperty
	public abstract double getLINE_LOOP();

	@JsProperty
	public abstract void setLINE_LOOP(final double value);

	@JsProperty
	public abstract double getLINE_STRIP();

	@JsProperty
	public abstract void setLINE_STRIP(final double value);

	@JsProperty
	public abstract double getLINE_WIDTH();

	@JsProperty
	public abstract void setLINE_WIDTH(final double value);

	@JsProperty
	public abstract double getLINK_STATUS();

	@JsProperty
	public abstract void setLINK_STATUS(final double value);

	@JsProperty
	public abstract double getLOW_FLOAT();

	@JsProperty
	public abstract void setLOW_FLOAT(final double value);

	@JsProperty
	public abstract double getLOW_INT();

	@JsProperty
	public abstract void setLOW_INT(final double value);

	@JsProperty
	public abstract double getLUMINANCE();

	@JsProperty
	public abstract void setLUMINANCE(final double value);

	@JsProperty
	public abstract double getLUMINANCE_ALPHA();

	@JsProperty
	public abstract void setLUMINANCE_ALPHA(final double value);

	@JsProperty
	public abstract double getMAX_COMBINED_TEXTURE_IMAGE_UNITS();

	@JsProperty
	public abstract void setMAX_COMBINED_TEXTURE_IMAGE_UNITS(final double value);

	@JsProperty
	public abstract double getMAX_CUBE_MAP_TEXTURE_SIZE();

	@JsProperty
	public abstract void setMAX_CUBE_MAP_TEXTURE_SIZE(final double value);

	@JsProperty
	public abstract double getMAX_FRAGMENT_UNIFORM_VECTORS();

	@JsProperty
	public abstract void setMAX_FRAGMENT_UNIFORM_VECTORS(final double value);

	@JsProperty
	public abstract double getMAX_RENDERBUFFER_SIZE();

	@JsProperty
	public abstract void setMAX_RENDERBUFFER_SIZE(final double value);

	@JsProperty
	public abstract double getMAX_TEXTURE_IMAGE_UNITS();

	@JsProperty
	public abstract void setMAX_TEXTURE_IMAGE_UNITS(final double value);

	@JsProperty
	public abstract double getMAX_TEXTURE_SIZE();

	@JsProperty
	public abstract void setMAX_TEXTURE_SIZE(final double value);

	@JsProperty
	public abstract double getMAX_VARYING_VECTORS();

	@JsProperty
	public abstract void setMAX_VARYING_VECTORS(final double value);

	@JsProperty
	public abstract double getMAX_VERTEX_ATTRIBS();

	@JsProperty
	public abstract void setMAX_VERTEX_ATTRIBS(final double value);

	@JsProperty
	public abstract double getMAX_VERTEX_TEXTURE_IMAGE_UNITS();

	@JsProperty
	public abstract void setMAX_VERTEX_TEXTURE_IMAGE_UNITS(final double value);

	@JsProperty
	public abstract double getMAX_VERTEX_UNIFORM_VECTORS();

	@JsProperty
	public abstract void setMAX_VERTEX_UNIFORM_VECTORS(final double value);

	@JsProperty
	public abstract double getMAX_VIEWPORT_DIMS();

	@JsProperty
	public abstract void setMAX_VIEWPORT_DIMS(final double value);

	@JsProperty
	public abstract double getMEDIUM_FLOAT();

	@JsProperty
	public abstract void setMEDIUM_FLOAT(final double value);

	@JsProperty
	public abstract double getMEDIUM_INT();

	@JsProperty
	public abstract void setMEDIUM_INT(final double value);

	@JsProperty
	public abstract double getMIRRORED_REPEAT();

	@JsProperty
	public abstract void setMIRRORED_REPEAT(final double value);

	@JsProperty
	public abstract double getNEAREST();

	@JsProperty
	public abstract void setNEAREST(final double value);

	@JsProperty
	public abstract double getNEAREST_MIPMAP_LINEAR();

	@JsProperty
	public abstract void setNEAREST_MIPMAP_LINEAR(final double value);

	@JsProperty
	public abstract double getNEAREST_MIPMAP_NEAREST();

	@JsProperty
	public abstract void setNEAREST_MIPMAP_NEAREST(final double value);

	@JsProperty
	public abstract double getNEVER();

	@JsProperty
	public abstract void setNEVER(final double value);

	@JsProperty
	public abstract double getNICEST();

	@JsProperty
	public abstract void setNICEST(final double value);

	@JsProperty
	public abstract double getNONE();

	@JsProperty
	public abstract void setNONE(final double value);

	@JsProperty
	public abstract double getNOTEQUAL();

	@JsProperty
	public abstract void setNOTEQUAL(final double value);

	@JsProperty
	public abstract double getNO_ERROR();

	@JsProperty
	public abstract void setNO_ERROR(final double value);

	@JsProperty
	public abstract double getONE();

	@JsProperty
	public abstract void setONE(final double value);

	@JsProperty
	public abstract double getONE_MINUS_CONSTANT_ALPHA();

	@JsProperty
	public abstract void setONE_MINUS_CONSTANT_ALPHA(final double value);

	@JsProperty
	public abstract double getONE_MINUS_CONSTANT_COLOR();

	@JsProperty
	public abstract void setONE_MINUS_CONSTANT_COLOR(final double value);

	@JsProperty
	public abstract double getONE_MINUS_DST_ALPHA();

	@JsProperty
	public abstract void setONE_MINUS_DST_ALPHA(final double value);

	@JsProperty
	public abstract double getONE_MINUS_DST_COLOR();

	@JsProperty
	public abstract void setONE_MINUS_DST_COLOR(final double value);

	@JsProperty
	public abstract double getONE_MINUS_SRC_ALPHA();

	@JsProperty
	public abstract void setONE_MINUS_SRC_ALPHA(final double value);

	@JsProperty
	public abstract double getONE_MINUS_SRC_COLOR();

	@JsProperty
	public abstract void setONE_MINUS_SRC_COLOR(final double value);

	@JsProperty
	public abstract double getOUT_OF_MEMORY();

	@JsProperty
	public abstract void setOUT_OF_MEMORY(final double value);

	@JsProperty
	public abstract double getPACK_ALIGNMENT();

	@JsProperty
	public abstract void setPACK_ALIGNMENT(final double value);

	@JsProperty
	public abstract double getPOINTS();

	@JsProperty
	public abstract void setPOINTS(final double value);

	@JsProperty
	public abstract double getPOLYGON_OFFSET_FACTOR();

	@JsProperty
	public abstract void setPOLYGON_OFFSET_FACTOR(final double value);

	@JsProperty
	public abstract double getPOLYGON_OFFSET_FILL();

	@JsProperty
	public abstract void setPOLYGON_OFFSET_FILL(final double value);

	@JsProperty
	public abstract double getPOLYGON_OFFSET_UNITS();

	@JsProperty
	public abstract void setPOLYGON_OFFSET_UNITS(final double value);

	@JsProperty
	public abstract double getRED_BITS();

	@JsProperty
	public abstract void setRED_BITS(final double value);

	@JsProperty
	public abstract double getRENDERBUFFER();

	@JsProperty
	public abstract void setRENDERBUFFER(final double value);

	@JsProperty
	public abstract double getRENDERBUFFER_ALPHA_SIZE();

	@JsProperty
	public abstract void setRENDERBUFFER_ALPHA_SIZE(final double value);

	@JsProperty
	public abstract double getRENDERBUFFER_BINDING();

	@JsProperty
	public abstract void setRENDERBUFFER_BINDING(final double value);

	@JsProperty
	public abstract double getRENDERBUFFER_BLUE_SIZE();

	@JsProperty
	public abstract void setRENDERBUFFER_BLUE_SIZE(final double value);

	@JsProperty
	public abstract double getRENDERBUFFER_DEPTH_SIZE();

	@JsProperty
	public abstract void setRENDERBUFFER_DEPTH_SIZE(final double value);

	@JsProperty
	public abstract double getRENDERBUFFER_GREEN_SIZE();

	@JsProperty
	public abstract void setRENDERBUFFER_GREEN_SIZE(final double value);

	@JsProperty
	public abstract double getRENDERBUFFER_HEIGHT();

	@JsProperty
	public abstract void setRENDERBUFFER_HEIGHT(final double value);

	@JsProperty
	public abstract double getRENDERBUFFER_INTERNAL_FORMAT();

	@JsProperty
	public abstract void setRENDERBUFFER_INTERNAL_FORMAT(final double value);

	@JsProperty
	public abstract double getRENDERBUFFER_RED_SIZE();

	@JsProperty
	public abstract void setRENDERBUFFER_RED_SIZE(final double value);

	@JsProperty
	public abstract double getRENDERBUFFER_STENCIL_SIZE();

	@JsProperty
	public abstract void setRENDERBUFFER_STENCIL_SIZE(final double value);

	@JsProperty
	public abstract double getRENDERBUFFER_WIDTH();

	@JsProperty
	public abstract void setRENDERBUFFER_WIDTH(final double value);

	@JsProperty
	public abstract double getRENDERER();

	@JsProperty
	public abstract void setRENDERER(final double value);

	@JsProperty
	public abstract double getREPEAT();

	@JsProperty
	public abstract void setREPEAT(final double value);

	@JsProperty
	public abstract double getREPLACE();

	@JsProperty
	public abstract void setREPLACE(final double value);

	@JsProperty
	public abstract double getRGB();

	@JsProperty
	public abstract void setRGB(final double value);

	@JsProperty
	public abstract double getRGB565();

	@JsProperty
	public abstract void setRGB565(final double value);

	@JsProperty
	public abstract double getRGB5_A1();

	@JsProperty
	public abstract void setRGB5_A1(final double value);

	@JsProperty
	public abstract double getRGBA();

	@JsProperty
	public abstract void setRGBA(final double value);

	@JsProperty
	public abstract double getRGBA4();

	@JsProperty
	public abstract void setRGBA4(final double value);

	@JsProperty
	public abstract double getSAMPLER_2D();

	@JsProperty
	public abstract void setSAMPLER_2D(final double value);

	@JsProperty
	public abstract double getSAMPLER_CUBE();

	@JsProperty
	public abstract void setSAMPLER_CUBE(final double value);

	@JsProperty
	public abstract double getSAMPLES();

	@JsProperty
	public abstract void setSAMPLES(final double value);

	@JsProperty
	public abstract double getSAMPLE_ALPHA_TO_COVERAGE();

	@JsProperty
	public abstract void setSAMPLE_ALPHA_TO_COVERAGE(final double value);

	@JsProperty
	public abstract double getSAMPLE_BUFFERS();

	@JsProperty
	public abstract void setSAMPLE_BUFFERS(final double value);

	@JsProperty
	public abstract double getSAMPLE_COVERAGE();

	@JsProperty
	public abstract void setSAMPLE_COVERAGE(final double value);

	@JsProperty
	public abstract double getSAMPLE_COVERAGE_INVERT();

	@JsProperty
	public abstract void setSAMPLE_COVERAGE_INVERT(final double value);

	@JsProperty
	public abstract double getSAMPLE_COVERAGE_VALUE();

	@JsProperty
	public abstract void setSAMPLE_COVERAGE_VALUE(final double value);

	@JsProperty
	public abstract double getSCISSOR_BOX();

	@JsProperty
	public abstract void setSCISSOR_BOX(final double value);

	@JsProperty
	public abstract double getSCISSOR_TEST();

	@JsProperty
	public abstract void setSCISSOR_TEST(final double value);

	@JsProperty
	public abstract double getSHADER_TYPE();

	@JsProperty
	public abstract void setSHADER_TYPE(final double value);

	@JsProperty
	public abstract double getSHADING_LANGUAGE_VERSION();

	@JsProperty
	public abstract void setSHADING_LANGUAGE_VERSION(final double value);

	@JsProperty
	public abstract double getSHORT();

	@JsProperty
	public abstract void setSHORT(final double value);

	@JsProperty
	public abstract double getSRC_ALPHA();

	@JsProperty
	public abstract void setSRC_ALPHA(final double value);

	@JsProperty
	public abstract double getSRC_ALPHA_SATURATE();

	@JsProperty
	public abstract void setSRC_ALPHA_SATURATE(final double value);

	@JsProperty
	public abstract double getSRC_COLOR();

	@JsProperty
	public abstract void setSRC_COLOR(final double value);

	@JsProperty
	public abstract double getSTATIC_DRAW();

	@JsProperty
	public abstract void setSTATIC_DRAW(final double value);

	@JsProperty
	public abstract double getSTENCIL_ATTACHMENT();

	@JsProperty
	public abstract void setSTENCIL_ATTACHMENT(final double value);

	@JsProperty
	public abstract double getSTENCIL_BACK_FAIL();

	@JsProperty
	public abstract void setSTENCIL_BACK_FAIL(final double value);

	@JsProperty
	public abstract double getSTENCIL_BACK_FUNC();

	@JsProperty
	public abstract void setSTENCIL_BACK_FUNC(final double value);

	@JsProperty
	public abstract double getSTENCIL_BACK_PASS_DEPTH_FAIL();

	@JsProperty
	public abstract void setSTENCIL_BACK_PASS_DEPTH_FAIL(final double value);

	@JsProperty
	public abstract double getSTENCIL_BACK_PASS_DEPTH_PASS();

	@JsProperty
	public abstract void setSTENCIL_BACK_PASS_DEPTH_PASS(final double value);

	@JsProperty
	public abstract double getSTENCIL_BACK_REF();

	@JsProperty
	public abstract void setSTENCIL_BACK_REF(final double value);

	@JsProperty
	public abstract double getSTENCIL_BACK_VALUE_MASK();

	@JsProperty
	public abstract void setSTENCIL_BACK_VALUE_MASK(final double value);

	@JsProperty
	public abstract double getSTENCIL_BACK_WRITEMASK();

	@JsProperty
	public abstract void setSTENCIL_BACK_WRITEMASK(final double value);

	@JsProperty
	public abstract double getSTENCIL_BITS();

	@JsProperty
	public abstract void setSTENCIL_BITS(final double value);

	@JsProperty
	public abstract double getSTENCIL_BUFFER_BIT();

	@JsProperty
	public abstract void setSTENCIL_BUFFER_BIT(final double value);

	@JsProperty
	public abstract double getSTENCIL_CLEAR_VALUE();

	@JsProperty
	public abstract void setSTENCIL_CLEAR_VALUE(final double value);

	@JsProperty
	public abstract double getSTENCIL_FAIL();

	@JsProperty
	public abstract void setSTENCIL_FAIL(final double value);

	@JsProperty
	public abstract double getSTENCIL_FUNC();

	@JsProperty
	public abstract void setSTENCIL_FUNC(final double value);

	@JsProperty
	public abstract double getSTENCIL_INDEX();

	@JsProperty
	public abstract void setSTENCIL_INDEX(final double value);

	@JsProperty
	public abstract double getSTENCIL_INDEX8();

	@JsProperty
	public abstract void setSTENCIL_INDEX8(final double value);

	@JsProperty
	public abstract double getSTENCIL_PASS_DEPTH_FAIL();

	@JsProperty
	public abstract void setSTENCIL_PASS_DEPTH_FAIL(final double value);

	@JsProperty
	public abstract double getSTENCIL_PASS_DEPTH_PASS();

	@JsProperty
	public abstract void setSTENCIL_PASS_DEPTH_PASS(final double value);

	@JsProperty
	public abstract double getSTENCIL_REF();

	@JsProperty
	public abstract void setSTENCIL_REF(final double value);

	@JsProperty
	public abstract double getSTENCIL_TEST();

	@JsProperty
	public abstract void setSTENCIL_TEST(final double value);

	@JsProperty
	public abstract double getSTENCIL_VALUE_MASK();

	@JsProperty
	public abstract void setSTENCIL_VALUE_MASK(final double value);

	@JsProperty
	public abstract double getSTENCIL_WRITEMASK();

	@JsProperty
	public abstract void setSTENCIL_WRITEMASK(final double value);

	@JsProperty
	public abstract double getSTREAM_DRAW();

	@JsProperty
	public abstract void setSTREAM_DRAW(final double value);

	@JsProperty
	public abstract double getSUBPIXEL_BITS();

	@JsProperty
	public abstract void setSUBPIXEL_BITS(final double value);

	@JsProperty
	public abstract double getTEXTURE();

	@JsProperty
	public abstract void setTEXTURE(final double value);

	@JsProperty
	public abstract double getTEXTURE0();

	@JsProperty
	public abstract void setTEXTURE0(final double value);

	@JsProperty
	public abstract double getTEXTURE1();

	@JsProperty
	public abstract void setTEXTURE1(final double value);

	@JsProperty
	public abstract double getTEXTURE10();

	@JsProperty
	public abstract void setTEXTURE10(final double value);

	@JsProperty
	public abstract double getTEXTURE11();

	@JsProperty
	public abstract void setTEXTURE11(final double value);

	@JsProperty
	public abstract double getTEXTURE12();

	@JsProperty
	public abstract void setTEXTURE12(final double value);

	@JsProperty
	public abstract double getTEXTURE13();

	@JsProperty
	public abstract void setTEXTURE13(final double value);

	@JsProperty
	public abstract double getTEXTURE14();

	@JsProperty
	public abstract void setTEXTURE14(final double value);

	@JsProperty
	public abstract double getTEXTURE15();

	@JsProperty
	public abstract void setTEXTURE15(final double value);

	@JsProperty
	public abstract double getTEXTURE16();

	@JsProperty
	public abstract void setTEXTURE16(final double value);

	@JsProperty
	public abstract double getTEXTURE17();

	@JsProperty
	public abstract void setTEXTURE17(final double value);

	@JsProperty
	public abstract double getTEXTURE18();

	@JsProperty
	public abstract void setTEXTURE18(final double value);

	@JsProperty
	public abstract double getTEXTURE19();

	@JsProperty
	public abstract void setTEXTURE19(final double value);

	@JsProperty
	public abstract double getTEXTURE2();

	@JsProperty
	public abstract void setTEXTURE2(final double value);

	@JsProperty
	public abstract double getTEXTURE20();

	@JsProperty
	public abstract void setTEXTURE20(final double value);

	@JsProperty
	public abstract double getTEXTURE21();

	@JsProperty
	public abstract void setTEXTURE21(final double value);

	@JsProperty
	public abstract double getTEXTURE22();

	@JsProperty
	public abstract void setTEXTURE22(final double value);

	@JsProperty
	public abstract double getTEXTURE23();

	@JsProperty
	public abstract void setTEXTURE23(final double value);

	@JsProperty
	public abstract double getTEXTURE24();

	@JsProperty
	public abstract void setTEXTURE24(final double value);

	@JsProperty
	public abstract double getTEXTURE25();

	@JsProperty
	public abstract void setTEXTURE25(final double value);

	@JsProperty
	public abstract double getTEXTURE26();

	@JsProperty
	public abstract void setTEXTURE26(final double value);

	@JsProperty
	public abstract double getTEXTURE27();

	@JsProperty
	public abstract void setTEXTURE27(final double value);

	@JsProperty
	public abstract double getTEXTURE28();

	@JsProperty
	public abstract void setTEXTURE28(final double value);

	@JsProperty
	public abstract double getTEXTURE29();

	@JsProperty
	public abstract void setTEXTURE29(final double value);

	@JsProperty
	public abstract double getTEXTURE3();

	@JsProperty
	public abstract void setTEXTURE3(final double value);

	@JsProperty
	public abstract double getTEXTURE30();

	@JsProperty
	public abstract void setTEXTURE30(final double value);

	@JsProperty
	public abstract double getTEXTURE31();

	@JsProperty
	public abstract void setTEXTURE31(final double value);

	@JsProperty
	public abstract double getTEXTURE4();

	@JsProperty
	public abstract void setTEXTURE4(final double value);

	@JsProperty
	public abstract double getTEXTURE5();

	@JsProperty
	public abstract void setTEXTURE5(final double value);

	@JsProperty
	public abstract double getTEXTURE6();

	@JsProperty
	public abstract void setTEXTURE6(final double value);

	@JsProperty
	public abstract double getTEXTURE7();

	@JsProperty
	public abstract void setTEXTURE7(final double value);

	@JsProperty
	public abstract double getTEXTURE8();

	@JsProperty
	public abstract void setTEXTURE8(final double value);

	@JsProperty
	public abstract double getTEXTURE9();

	@JsProperty
	public abstract void setTEXTURE9(final double value);

	@JsProperty
	public abstract double getTEXTURE_2D();

	@JsProperty
	public abstract void setTEXTURE_2D(final double value);

	@JsProperty
	public abstract double getTEXTURE_BINDING_2D();

	@JsProperty
	public abstract void setTEXTURE_BINDING_2D(final double value);

	@JsProperty
	public abstract double getTEXTURE_BINDING_CUBE_MAP();

	@JsProperty
	public abstract void setTEXTURE_BINDING_CUBE_MAP(final double value);

	@JsProperty
	public abstract double getTEXTURE_CUBE_MAP();

	@JsProperty
	public abstract void setTEXTURE_CUBE_MAP(final double value);

	@JsProperty
	public abstract double getTEXTURE_CUBE_MAP_NEGATIVE_X();

	@JsProperty
	public abstract void setTEXTURE_CUBE_MAP_NEGATIVE_X(final double value);

	@JsProperty
	public abstract double getTEXTURE_CUBE_MAP_NEGATIVE_Y();

	@JsProperty
	public abstract void setTEXTURE_CUBE_MAP_NEGATIVE_Y(final double value);

	@JsProperty
	public abstract double getTEXTURE_CUBE_MAP_NEGATIVE_Z();

	@JsProperty
	public abstract void setTEXTURE_CUBE_MAP_NEGATIVE_Z(final double value);

	@JsProperty
	public abstract double getTEXTURE_CUBE_MAP_POSITIVE_X();

	@JsProperty
	public abstract void setTEXTURE_CUBE_MAP_POSITIVE_X(final double value);

	@JsProperty
	public abstract double getTEXTURE_CUBE_MAP_POSITIVE_Y();

	@JsProperty
	public abstract void setTEXTURE_CUBE_MAP_POSITIVE_Y(final double value);

	@JsProperty
	public abstract double getTEXTURE_CUBE_MAP_POSITIVE_Z();

	@JsProperty
	public abstract void setTEXTURE_CUBE_MAP_POSITIVE_Z(final double value);

	@JsProperty
	public abstract double getTEXTURE_MAG_FILTER();

	@JsProperty
	public abstract void setTEXTURE_MAG_FILTER(final double value);

	@JsProperty
	public abstract double getTEXTURE_MIN_FILTER();

	@JsProperty
	public abstract void setTEXTURE_MIN_FILTER(final double value);

	@JsProperty
	public abstract double getTEXTURE_WRAP_S();

	@JsProperty
	public abstract void setTEXTURE_WRAP_S(final double value);

	@JsProperty
	public abstract double getTEXTURE_WRAP_T();

	@JsProperty
	public abstract void setTEXTURE_WRAP_T(final double value);

	@JsProperty
	public abstract double getTRIANGLES();

	@JsProperty
	public abstract void setTRIANGLES(final double value);

	@JsProperty
	public abstract double getTRIANGLE_FAN();

	@JsProperty
	public abstract void setTRIANGLE_FAN(final double value);

	@JsProperty
	public abstract double getTRIANGLE_STRIP();

	@JsProperty
	public abstract void setTRIANGLE_STRIP(final double value);

	@JsProperty
	public abstract double getUNPACK_ALIGNMENT();

	@JsProperty
	public abstract void setUNPACK_ALIGNMENT(final double value);

	@JsProperty
	public abstract double getUNPACK_COLORSPACE_CONVERSION_WEBGL();

	@JsProperty
	public abstract void setUNPACK_COLORSPACE_CONVERSION_WEBGL(final double value);

	@JsProperty
	public abstract double getUNPACK_FLIP_Y_WEBGL();

	@JsProperty
	public abstract void setUNPACK_FLIP_Y_WEBGL(final double value);

	@JsProperty
	public abstract double getUNPACK_PREMULTIPLY_ALPHA_WEBGL();

	@JsProperty
	public abstract void setUNPACK_PREMULTIPLY_ALPHA_WEBGL(final double value);

	@JsProperty
	public abstract double getUNSIGNED_BYTE();

	@JsProperty
	public abstract void setUNSIGNED_BYTE(final double value);

	@JsProperty
	public abstract double getUNSIGNED_INT();

	@JsProperty
	public abstract void setUNSIGNED_INT(final double value);

	@JsProperty
	public abstract double getUNSIGNED_SHORT();

	@JsProperty
	public abstract void setUNSIGNED_SHORT(final double value);

	@JsProperty
	public abstract double getUNSIGNED_SHORT_4_4_4_4();

	@JsProperty
	public abstract void setUNSIGNED_SHORT_4_4_4_4(final double value);

	@JsProperty
	public abstract double getUNSIGNED_SHORT_5_5_5_1();

	@JsProperty
	public abstract void setUNSIGNED_SHORT_5_5_5_1(final double value);

	@JsProperty
	public abstract double getUNSIGNED_SHORT_5_6_5();

	@JsProperty
	public abstract void setUNSIGNED_SHORT_5_6_5(final double value);

	@JsProperty
	public abstract double getVALIDATE_STATUS();

	@JsProperty
	public abstract void setVALIDATE_STATUS(final double value);

	@JsProperty
	public abstract double getVENDOR();

	@JsProperty
	public abstract void setVENDOR(final double value);

	@JsProperty
	public abstract double getVERSION();

	@JsProperty
	public abstract void setVERSION(final double value);

	@JsProperty
	public abstract double getVERTEX_ATTRIB_ARRAY_BUFFER_BINDING();

	@JsProperty
	public abstract void setVERTEX_ATTRIB_ARRAY_BUFFER_BINDING(final double value);

	@JsProperty
	public abstract double getVERTEX_ATTRIB_ARRAY_ENABLED();

	@JsProperty
	public abstract void setVERTEX_ATTRIB_ARRAY_ENABLED(final double value);

	@JsProperty
	public abstract double getVERTEX_ATTRIB_ARRAY_NORMALIZED();

	@JsProperty
	public abstract void setVERTEX_ATTRIB_ARRAY_NORMALIZED(final double value);

	@JsProperty
	public abstract double getVERTEX_ATTRIB_ARRAY_POINTER();

	@JsProperty
	public abstract void setVERTEX_ATTRIB_ARRAY_POINTER(final double value);

	@JsProperty
	public abstract double getVERTEX_ATTRIB_ARRAY_SIZE();

	@JsProperty
	public abstract void setVERTEX_ATTRIB_ARRAY_SIZE(final double value);

	@JsProperty
	public abstract double getVERTEX_ATTRIB_ARRAY_STRIDE();

	@JsProperty
	public abstract void setVERTEX_ATTRIB_ARRAY_STRIDE(final double value);

	@JsProperty
	public abstract double getVERTEX_ATTRIB_ARRAY_TYPE();

	@JsProperty
	public abstract void setVERTEX_ATTRIB_ARRAY_TYPE(final double value);

	@JsProperty
	public abstract double getVERTEX_SHADER();

	@JsProperty
	public abstract void setVERTEX_SHADER(final double value);

	@JsProperty
	public abstract double getVIEWPORT();

	@JsProperty
	public abstract void setVIEWPORT(final double value);

	@JsProperty
	public abstract double getZERO();

	@JsProperty
	public abstract void setZERO(final double value);

	@JsMethod
	public abstract void activeTexture(final double texture);

	@JsMethod
	public abstract void attachShader(final WebGLProgram program, final WebGLShader shader);

	@JsMethod
	public abstract void bindAttribLocation(final WebGLProgram program, final double index, final String name);

	@JsMethod
	public abstract void bindBuffer(final double target, final WebGLBuffer buffer);

	@JsMethod
	public abstract void bindFramebuffer(final double target, final WebGLFramebuffer framebuffer);

	@JsMethod
	public abstract void bindRenderbuffer(final double target, final WebGLRenderbuffer renderbuffer);

	@JsMethod
	public abstract void bindTexture(final double target, final WebGLTexture texture);

	@JsMethod
	public abstract void blendColor(final double red, final double green, final double blue, final double alpha);

	@JsMethod
	public abstract void blendEquation(final double mode);

	@JsMethod
	public abstract void blendEquationSeparate(final double modeRGB, final double modeAlpha);

	@JsMethod
	public abstract void blendFunc(final double sfactor, final double dfactor);

	@JsMethod
	public abstract void blendFuncSeparate(final double srcRGB, final double dstRGB, final double srcAlpha,
			final double dstAlpha);

	@JsMethod
	public abstract void bufferData(final double target, final Object size, final double usage);

	@JsMethod
	public abstract void bufferSubData(final double target, final double offset, final Object data);

	@JsMethod
	public abstract double checkFramebufferStatus(final double target);

	@JsMethod
	public abstract void clear(final double mask);

	@JsMethod
	public abstract void clearColor(final double red, final double green, final double blue, final double alpha);

	@JsMethod
	public abstract void clearDepth(final double depth);

	@JsMethod
	public abstract void clearStencil(final double s);

	@JsMethod
	public abstract void colorMask(final boolean red, final boolean green, final boolean blue, final boolean alpha);

	@JsMethod
	public abstract void compileShader(final WebGLShader shader);

	@JsMethod
	public abstract void compressedTexImage2D(final double target, final double level, final double internalformat,
			final double width, final double height, final double border, final ArrayBufferView data);

	@JsMethod
	public abstract void compressedTexSubImage2D(final double target, final double level, final double xoffset,
			final double yoffset, final double width, final double height, final double format,
			final ArrayBufferView data);

	@JsMethod
	public abstract void copyTexImage2D(final double target, final double level, final double internalformat,
			final double x, final double y, final double width, final double height, final double border);

	@JsMethod
	public abstract void copyTexSubImage2D(final double target, final double level, final double xoffset,
			final double yoffset, final double x, final double y, final double width, final double height);

	@JsMethod
	public abstract WebGLBuffer createBuffer();

	@JsMethod
	public abstract WebGLFramebuffer createFramebuffer();

	@JsMethod
	public abstract WebGLProgram createProgram();

	@JsMethod
	public abstract WebGLRenderbuffer createRenderbuffer();

	@JsMethod
	public abstract WebGLShader createShader(final double type);

	@JsMethod
	public abstract WebGLTexture createTexture();

	@JsMethod
	public abstract void cullFace(final double mode);

	@JsMethod
	public abstract void deleteBuffer(final WebGLBuffer buffer);

	@JsMethod
	public abstract void deleteFramebuffer(final WebGLFramebuffer framebuffer);

	@JsMethod
	public abstract void deleteProgram(final WebGLProgram program);

	@JsMethod
	public abstract void deleteRenderbuffer(final WebGLRenderbuffer renderbuffer);

	@JsMethod
	public abstract void deleteShader(final WebGLShader shader);

	@JsMethod
	public abstract void deleteTexture(final WebGLTexture texture);

	@JsMethod
	public abstract void depthFunc(final double func);

	@JsMethod
	public abstract void depthMask(final boolean flag);

	@JsMethod
	public abstract void depthRange(final double zNear, final double zFar);

	@JsMethod
	public abstract void detachShader(final WebGLProgram program, final WebGLShader shader);

	@JsMethod
	public abstract void disable(final double cap);

	@JsMethod
	public abstract void disableVertexAttribArray(final double index);

	@JsMethod
	public abstract void drawArrays(final double mode, final double first, final double count);

	@JsMethod
	public abstract void drawElements(final double mode, final double count, final double type, final double offset);

	@JsMethod
	public abstract void enable(final double cap);

	@JsMethod
	public abstract void enableVertexAttribArray(final double index);

	@JsMethod
	public abstract void finish();

	@JsMethod
	public abstract void flush();

	@JsMethod
	public abstract void framebufferRenderbuffer(final double target, final double attachment,
			final double renderbuffertarget, final WebGLRenderbuffer renderbuffer);

	@JsMethod
	public abstract void framebufferTexture2D(final double target, final double attachment, final double textarget,
			final WebGLTexture texture, final double level);

	@JsMethod
	public abstract void frontFace(final double mode);

	@JsMethod
	public abstract void generateMipmap(final double target);

	@JsMethod
	public abstract WebGLActiveInfo getActiveAttrib(final WebGLProgram program, final double index);

	@JsMethod
	public abstract WebGLActiveInfo getActiveUniform(final WebGLProgram program, final double index);

	@JsMethod
	public abstract Object getAttachedShaders(final WebGLProgram program);

	@JsMethod
	public abstract double getAttribLocation(final WebGLProgram program, final String name);

	@JsMethod
	public abstract Object getBufferParameter(final double target, final double pname);

	@JsMethod
	public abstract WebGLContextAttributes getContextAttributes();

	@JsMethod
	public abstract double getError();

	@JsMethod
	public abstract Object getExtension(final String name);

	@JsMethod
	public abstract Object getFramebufferAttachmentParameter(final double target, final double attachment,
			final double pname);

	@JsMethod
	public abstract Object getParameter(final double pname);

	@JsMethod
	public abstract String getProgramInfoLog(final WebGLProgram program);

	@JsMethod
	public abstract Object getProgramParameter(final WebGLProgram program, final double pname);

	@JsMethod
	public abstract Object getRenderbufferParameter(final double target, final double pname);

	@JsMethod
	public abstract String getShaderInfoLog(final WebGLShader shader);

	@JsMethod
	public abstract Object getShaderParameter(final WebGLShader shader, final double pname);

	@JsMethod
	public abstract WebGLShaderPrecisionFormat getShaderPrecisionFormat(final double shadertype,
			final double precisiontype);

	@JsMethod
	public abstract String getShaderSource(final WebGLShader shader);

	@JsMethod
	public abstract Object getSupportedExtensions();

	@JsMethod
	public abstract Object getTexParameter(final double target, final double pname);

	@JsMethod
	public abstract Object getUniform(final WebGLProgram program, final WebGLUniformLocation location);

	@JsMethod
	public abstract WebGLUniformLocation getUniformLocation(final WebGLProgram program, final String name);

	@JsMethod
	public abstract Object getVertexAttrib(final double index, final double pname);

	@JsMethod
	public abstract double getVertexAttribOffset(final double index, final double pname);

	@JsMethod
	public abstract void hint(final double target, final double mode);

	@JsMethod
	public abstract boolean isBuffer(final WebGLBuffer buffer);

	@JsMethod
	public abstract boolean isContextLost();

	@JsMethod
	public abstract boolean isEnabled(final double cap);

	@JsMethod
	public abstract boolean isFramebuffer(final WebGLFramebuffer framebuffer);

	@JsMethod
	public abstract boolean isProgram(final WebGLProgram program);

	@JsMethod
	public abstract boolean isRenderbuffer(final WebGLRenderbuffer renderbuffer);

	@JsMethod
	public abstract boolean isShader(final WebGLShader shader);

	@JsMethod
	public abstract boolean isTexture(final WebGLTexture texture);

	@JsMethod
	public abstract void lineWidth(final double width);

	@JsMethod
	public abstract void linkProgram(final WebGLProgram program);

	@JsMethod
	public abstract void pixelStorei(final double pname, final double param);

	@JsMethod
	public abstract void polygonOffset(final double factor, final double units);

	@JsMethod
	public abstract void readPixels(final double x, final double y, final double width, final double height,
			final double format, final double type, final ArrayBufferView pixels);

	@JsMethod
	public abstract void renderbufferStorage(final double target, final double internalformat, final double width,
			final double height);

	@JsMethod
	public abstract void sampleCoverage(final double value, final boolean invert);

	@JsMethod
	public abstract void scissor(final double x, final double y, final double width, final double height);

	@JsMethod
	public abstract void shaderSource(final WebGLShader shader, final String source);

	@JsMethod
	public abstract void stencilFunc(final double func, final double ref, final double mask);

	@JsMethod
	public abstract void stencilFuncSeparate(final double face, final double func, final double ref, final double mask);

	@JsMethod
	public abstract void stencilMask(final double mask);

	@JsMethod
	public abstract void stencilMaskSeparate(final double face, final double mask);

	@JsMethod
	public abstract void stencilOp(final double fail, final double zfail, final double zpass);

	@JsMethod
	public abstract void stencilOpSeparate(final double face, final double fail, final double zfail,
			final double zpass);

	@JsMethod
	public abstract void texImage2D(final double target, final double level, final double internalformat,
			final double width, final double height, final double border, final double format, final double type,
			final ArrayBufferView pixels);

	@JsMethod
	public abstract void texImage2D(final double target, final double level, final double internalformat,
			final double format, final double type, final HTMLImageElement image);

	@JsMethod
	public abstract void texImage2D(final double target, final double level, final double internalformat,
			final double format, final double type, final HTMLCanvasElement canvas);

	@JsMethod
	public abstract void texImage2D(final double target, final double level, final double internalformat,
			final double format, final double type, final HTMLVideoElement video);

	@JsMethod
	public abstract void texImage2D(final double target, final double level, final double internalformat,
			final double format, final double type, final ImageData pixels);

	@JsMethod
	public abstract void texParameterf(final double target, final double pname, final double param);

	@JsMethod
	public abstract void texParameteri(final double target, final double pname, final double param);

	@JsMethod
	public abstract void texSubImage2D(final double target, final double level, final double xoffset,
			final double yoffset, final double width, final double height, final double format, final double type,
			final ArrayBufferView pixels);

	@JsMethod
	public abstract void texSubImage2D(final double target, final double level, final double xoffset,
			final double yoffset, final double format, final double type, final HTMLImageElement image);

	@JsMethod
	public abstract void texSubImage2D(final double target, final double level, final double xoffset,
			final double yoffset, final double format, final double type, final HTMLCanvasElement canvas);

	@JsMethod
	public abstract void texSubImage2D(final double target, final double level, final double xoffset,
			final double yoffset, final double format, final double type, final HTMLVideoElement video);

	@JsMethod
	public abstract void texSubImage2D(final double target, final double level, final double xoffset,
			final double yoffset, final double format, final double type, final ImageData pixels);

	@JsMethod
	public abstract void uniform1f(final WebGLUniformLocation location, final double x);

	@JsMethod
	public abstract void uniform1fv(final WebGLUniformLocation location, final Float32Array v);

	@JsMethod
	public abstract void uniform1i(final WebGLUniformLocation location, final double x);

	@JsMethod
	public abstract void uniform1iv(final WebGLUniformLocation location, final Int32Array v);

	@JsMethod
	public abstract void uniform2f(final WebGLUniformLocation location, final double x, final double y);

	@JsMethod
	public abstract void uniform2fv(final WebGLUniformLocation location, final Float32Array v);

	@JsMethod
	public abstract void uniform2i(final WebGLUniformLocation location, final double x, final double y);

	@JsMethod
	public abstract void uniform2iv(final WebGLUniformLocation location, final Int32Array v);

	@JsMethod
	public abstract void uniform3f(final WebGLUniformLocation location, final double x, final double y, final double z);

	@JsMethod
	public abstract void uniform3fv(final WebGLUniformLocation location, final Float32Array v);

	@JsMethod
	public abstract void uniform3i(final WebGLUniformLocation location, final double x, final double y, final double z);

	@JsMethod
	public abstract void uniform3iv(final WebGLUniformLocation location, final Int32Array v);

	@JsMethod
	public abstract void uniform4f(final WebGLUniformLocation location, final double x, final double y, final double z,
			final double w);

	@JsMethod
	public abstract void uniform4fv(final WebGLUniformLocation location, final Float32Array v);

	@JsMethod
	public abstract void uniform4i(final WebGLUniformLocation location, final double x, final double y, final double z,
			final double w);

	@JsMethod
	public abstract void uniform4iv(final WebGLUniformLocation location, final Int32Array v);

	@JsMethod
	public abstract void uniformMatrix2fv(final WebGLUniformLocation location, final boolean transpose,
			final Float32Array value);

	@JsMethod
	public abstract void uniformMatrix3fv(final WebGLUniformLocation location, final boolean transpose,
			final Float32Array value);

	@JsMethod
	public abstract void uniformMatrix4fv(final WebGLUniformLocation location, final boolean transpose,
			final Float32Array value);

	@JsMethod
	public abstract void useProgram(final WebGLProgram program);

	@JsMethod
	public abstract void validateProgram(final WebGLProgram program);

	@JsMethod
	public abstract void vertexAttrib1f(final double indx, final double x);

	@JsMethod
	public abstract void vertexAttrib1fv(final double indx, final Float32Array values);

	@JsMethod
	public abstract void vertexAttrib2f(final double indx, final double x, final double y);

	@JsMethod
	public abstract void vertexAttrib2fv(final double indx, final Float32Array values);

	@JsMethod
	public abstract void vertexAttrib3f(final double indx, final double x, final double y, final double z);

	@JsMethod
	public abstract void vertexAttrib3fv(final double indx, final Float32Array values);

	@JsMethod
	public abstract void vertexAttrib4f(final double indx, final double x, final double y, final double z,
			final double w);

	@JsMethod
	public abstract void vertexAttrib4fv(final double indx, final Float32Array values);

	@JsMethod
	public abstract void vertexAttribPointer(final double indx, final double size, final double type,
			final boolean normalized, final double stride, final double offset);

	@JsMethod
	public abstract void viewport(final double x, final double y, final double width, final double height);
}
