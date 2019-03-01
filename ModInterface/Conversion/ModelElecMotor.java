/*******************************************************************************
 * @author Reika Kalseki
 * 
 * Copyright 2017
 * 
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
// Date: 30/10/2013 8:01:16 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package Reika.RotaryCraft.ModInterface.Conversion;

import java.util.ArrayList;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

import net.minecraft.tileentity.TileEntity;

import Reika.DragonAPI.Instantiable.Rendering.LODModelPart;
import Reika.DragonAPI.Libraries.IO.ReikaColorAPI;
import Reika.DragonAPI.Libraries.IO.ReikaRenderHelper;
import Reika.RotaryCraft.Base.RotaryModelBase;

public class ModelElecMotor extends RotaryModelBase
{
	//fields
	LODModelPart Shape1;
	LODModelPart Shape1a;
	LODModelPart Shape1b;
	LODModelPart Shape1c;
	LODModelPart Shape1d;
	LODModelPart Shape1e;
	LODModelPart Shape1f;
	LODModelPart Shape1g;
	LODModelPart Shape1h;
	LODModelPart Shape1u;
	LODModelPart Shape1i;
	LODModelPart Shape1k;
	LODModelPart Shape2;
	LODModelPart Shape2a;
	LODModelPart Shape1l;
	LODModelPart Shape1m;
	LODModelPart Shape1n;
	LODModelPart Shape1o;
	LODModelPart Shape1p;
	LODModelPart Shape1q;
	LODModelPart Shape1r;
	LODModelPart Shape1s;
	LODModelPart Shape3;
	LODModelPart Shape4;
	LODModelPart Shape4a;
	LODModelPart Shape4b;
	LODModelPart Shape4c;
	LODModelPart c5;
	LODModelPart c1;
	LODModelPart c1a;
	LODModelPart c1b;
	LODModelPart c1c;
	LODModelPart c2;
	LODModelPart c3;
	LODModelPart c4;
	LODModelPart c2a;
	LODModelPart c2b;
	LODModelPart c2c;
	LODModelPart c3a;
	LODModelPart c3b;
	LODModelPart c3c;
	LODModelPart c4a;
	LODModelPart c4b;
	LODModelPart c4c;
	LODModelPart c5a;
	LODModelPart c5b;
	LODModelPart c5c;
	LODModelPart Shape1ka;
	LODModelPart Shape1kb;
	LODModelPart Shape1kc;
	LODModelPart Shape1kd;
	LODModelPart Shape1ke;
	LODModelPart Shape1kf;
	LODModelPart Shape1kg;
	LODModelPart Shape1kh;

	LODModelPart Shape5;
	LODModelPart Shape5a;
	LODModelPart Shape5b;
	LODModelPart Shape5c;
	LODModelPart Shape5d;
	LODModelPart Shape5e;
	LODModelPart Shape5f;
	LODModelPart Shape5g;

	public ModelElecMotor()
	{
		textureWidth = 128;
		textureHeight = 128;

		Shape1 = new LODModelPart(this, 0, 20);
		Shape1.addBox(-5F, -5F, 0F, 10, 10, 3);
		Shape1.setRotationPoint(0F, 15F, 4F);
		Shape1.setTextureSize(128, 128);
		Shape1.mirror = true;
		this.setRotation(Shape1, 0F, 0F, 0.7853982F);
		Shape1a = new LODModelPart(this, 0, 20);
		Shape1a.addBox(-5F, -5F, 0F, 10, 10, 3);
		Shape1a.setRotationPoint(0F, 15F, 4F);
		Shape1a.setTextureSize(128, 128);
		Shape1a.mirror = true;
		this.setRotation(Shape1a, 0F, 0F, 1.178097F);
		Shape1b = new LODModelPart(this, 0, 35);
		Shape1b.addBox(-5F, -5F, 0F, 10, 10, 3);
		Shape1b.setRotationPoint(0F, 15F, -7F);
		Shape1b.setTextureSize(128, 128);
		Shape1b.mirror = true;
		this.setRotation(Shape1b, 0F, 0F, 0.7853982F);
		Shape1c = new LODModelPart(this, 65, 8);
		Shape1c.addBox(-3F, -3F, 0F, 6, 6, 1);
		Shape1c.setRotationPoint(0F, 15F, -7.9F);
		Shape1c.setTextureSize(128, 128);
		Shape1c.mirror = true;
		this.setRotation(Shape1c, 0F, 0F, 0.7853982F);
		Shape1d = new LODModelPart(this, 0, 70);
		Shape1d.addBox(-4F, -4F, 0F, 8, 8, 8);
		Shape1d.setRotationPoint(0F, 15F, -4F);
		Shape1d.setTextureSize(128, 128);
		Shape1d.mirror = true;
		this.setRotation(Shape1d, 0F, 0F, 0.7853982F);
		Shape1e = new LODModelPart(this, 65, 8);
		Shape1e.addBox(-3F, -3F, 0F, 6, 6, 1);
		Shape1e.setRotationPoint(0F, 15F, -7.7F);
		Shape1e.setTextureSize(128, 128);
		Shape1e.mirror = true;
		this.setRotation(Shape1e, 0F, 0F, 1.178097F);
		Shape1f = new LODModelPart(this, 0, 35);
		Shape1f.addBox(-5F, -5F, 0F, 10, 10, 3);
		Shape1f.setRotationPoint(0F, 15F, -7F);
		Shape1f.setTextureSize(128, 128);
		Shape1f.mirror = true;
		this.setRotation(Shape1f, 0F, 0F, 1.178097F);
		Shape1g = new LODModelPart(this, 0, 70);
		Shape1g.addBox(-4F, -4F, 0F, 8, 8, 8);
		Shape1g.setRotationPoint(0F, 15F, -4F);
		Shape1g.setTextureSize(128, 128);
		Shape1g.mirror = true;
		this.setRotation(Shape1g, 0F, 0F, 1.178097F);
		Shape1h = new LODModelPart(this, 0, 35);
		Shape1h.addBox(-5F, -5F, 0F, 10, 10, 3);
		Shape1h.setRotationPoint(0F, 15F, -7F);
		Shape1h.setTextureSize(128, 128);
		Shape1h.mirror = true;
		this.setRotation(Shape1h, 0F, 0F, 0F);
		Shape1u = new LODModelPart(this, 0, 35);
		Shape1u.addBox(-5F, -5F, 0F, 10, 10, 3);
		Shape1u.setRotationPoint(0F, 15F, -7F);
		Shape1u.setTextureSize(128, 128);
		Shape1u.mirror = true;
		this.setRotation(Shape1u, 0F, 0F, 0.3926991F);
		Shape1i = new LODModelPart(this, 0, 20);
		Shape1i.addBox(-5F, -5F, 0F, 10, 10, 3);
		Shape1i.setRotationPoint(0F, 15F, 4F);
		Shape1i.setTextureSize(128, 128);
		Shape1i.mirror = true;
		this.setRotation(Shape1i, 0F, 0F, 0F);
		Shape1k = new LODModelPart(this, 0, 35);
		Shape1k.addBox(-5F, -5F, 0F, 10, 10, 3);
		Shape1k.setRotationPoint(0F, 15F, -7F);
		Shape1k.setTextureSize(128, 128);
		Shape1k.mirror = true;
		this.setRotation(Shape1k, 0F, 0F, 0.1963495F);
		Shape2 = new LODModelPart(this, 0, 12);
		Shape2.addBox(-1F, -1F, 0F, 2, 2, 2);
		Shape2.setRotationPoint(0F, 15F, 6.5F);
		Shape2.setTextureSize(128, 128);
		Shape2.mirror = true;
		this.setRotation(Shape2, 0F, 0F, 0.7853982F);
		Shape2a = new LODModelPart(this, 0, 12);
		Shape2a.addBox(-1F, -1F, 0F, 2, 2, 2);
		Shape2a.setRotationPoint(0F, 15F, 6.5F);
		Shape2a.setTextureSize(128, 128);
		Shape2a.mirror = true;
		this.setRotation(Shape2a, 0F, 0F, 0F);
		Shape1l = new LODModelPart(this, 65, 0);
		Shape1l.addBox(-3F, -3F, 0F, 6, 6, 1);
		Shape1l.setRotationPoint(0F, 15F, 6.7F);
		Shape1l.setTextureSize(128, 128);
		Shape1l.mirror = true;
		this.setRotation(Shape1l, 0F, 0F, 0.3926991F);
		Shape1m = new LODModelPart(this, 65, 8);
		Shape1m.addBox(-3F, -3F, 0F, 6, 6, 1);
		Shape1m.setRotationPoint(0F, 15F, -7.8F);
		Shape1m.setTextureSize(128, 128);
		Shape1m.mirror = true;
		this.setRotation(Shape1m, 0F, 0F, 0.3926991F);
		Shape1n = new LODModelPart(this, 0, 70);
		Shape1n.addBox(-4F, -4F, 0F, 8, 8, 8);
		Shape1n.setRotationPoint(0F, 15F, -4F);
		Shape1n.setTextureSize(128, 128);
		Shape1n.mirror = true;
		this.setRotation(Shape1n, 0F, 0F, 0F);
		Shape1o = new LODModelPart(this, 0, 70);
		Shape1o.addBox(-4F, -4F, 0F, 8, 8, 8);
		Shape1o.setRotationPoint(0F, 15F, -4F);
		Shape1o.setTextureSize(128, 128);
		Shape1o.mirror = true;
		this.setRotation(Shape1o, 0F, 0F, 0.3926991F);
		Shape1p = new LODModelPart(this, 65, 8);
		Shape1p.addBox(-3F, -3F, 0F, 6, 6, 1);
		Shape1p.setRotationPoint(0F, 15F, -8F);
		Shape1p.setTextureSize(128, 128);
		Shape1p.mirror = true;
		this.setRotation(Shape1p, 0F, 0F, 0F);
		Shape1q = new LODModelPart(this, 65, 0);
		Shape1q.addBox(-3F, -3F, 0F, 6, 6, 1);
		Shape1q.setRotationPoint(0F, 15F, 7F);
		Shape1q.setTextureSize(128, 128);
		Shape1q.mirror = true;
		this.setRotation(Shape1q, 0F, 0F, 0F);
		Shape1r = new LODModelPart(this, 65, 0);
		Shape1r.addBox(-3F, -3F, 0F, 6, 6, 1);
		Shape1r.setRotationPoint(0F, 15F, 6.9F);
		Shape1r.setTextureSize(128, 128);
		Shape1r.mirror = true;
		this.setRotation(Shape1r, 0F, 0F, 0.7853982F);
		Shape1s = new LODModelPart(this, 65, 0);
		Shape1s.addBox(-3F, -3F, 0F, 6, 6, 1);
		Shape1s.setRotationPoint(0F, 15F, 6.8F);
		Shape1s.setTextureSize(128, 128);
		Shape1s.mirror = true;
		this.setRotation(Shape1s, 0F, 0F, 1.178097F);
		Shape3 = new LODModelPart(this, 0, 50);
		Shape3.addBox(0F, 0F, 0F, 16, 2, 16);
		Shape3.setRotationPoint(-8F, 22F, -8F);
		Shape3.setTextureSize(128, 128);
		Shape3.mirror = true;
		this.setRotation(Shape3, 0F, 0F, 0F);
		Shape4 = new LODModelPart(this, 41, 6);
		Shape4.addBox(0F, -2F, -2F, 5, 2, 2);
		Shape4.setRotationPoint(7F, 22F, -4.5F);
		Shape4.setTextureSize(128, 128);
		Shape4.mirror = true;
		this.setRotation(Shape4, 0F, 0F, -2.356194F);
		Shape4a = new LODModelPart(this, 22, 6);
		Shape4a.addBox(0F, 0F, -2F, 5, 2, 2);
		Shape4a.setRotationPoint(-7F, 22F, -4.5F);
		Shape4a.setTextureSize(128, 128);
		Shape4a.mirror = true;
		this.setRotation(Shape4a, 0F, 0F, -0.7853982F);
		Shape4b = new LODModelPart(this, 22, 0);
		Shape4b.addBox(0F, 0F, -2F, 5, 2, 2);
		Shape4b.setRotationPoint(-7F, 22F, 6.5F);
		Shape4b.setTextureSize(128, 128);
		Shape4b.mirror = true;
		this.setRotation(Shape4b, 0F, 0F, -0.7853982F);
		Shape4c = new LODModelPart(this, 41, 0);
		Shape4c.addBox(0F, -2F, -2F, 5, 2, 2);
		Shape4c.setRotationPoint(7F, 22F, 6.5F);
		Shape4c.setTextureSize(128, 128);
		Shape4c.mirror = true;
		this.setRotation(Shape4c, 0F, 0F, -2.356194F);
		c5 = new LODModelPart(this, 0, 0);
		c5.addBox(-4.5F, -4.5F, 0F, 9, 9, 1);
		c5.setRotationPoint(0F, 15F, -3.5F);
		c5.setTextureSize(128, 128);
		c5.mirror = true;
		this.setRotation(c5, 0F, 0F, 0.7853982F);
		c1 = new LODModelPart(this, 0, 0);
		c1.addBox(-4.5F, -4.5F, 0F, 9, 9, 1);
		c1.setRotationPoint(0F, 15F, 2.5F);
		c1.setTextureSize(128, 128);
		c1.mirror = true;
		this.setRotation(c1, 0F, 0F, 0F);
		c1a = new LODModelPart(this, 0, 0);
		c1a.addBox(-4.5F, -4.5F, 0F, 9, 9, 1);
		c1a.setRotationPoint(0F, 15F, 2.5F);
		c1a.setTextureSize(128, 128);
		c1a.mirror = true;
		this.setRotation(c1a, 0F, 0F, 0.7853982F);
		c1b = new LODModelPart(this, 0, 0);
		c1b.addBox(-4.5F, -4.5F, 0F, 9, 9, 1);
		c1b.setRotationPoint(0F, 15F, 2.5F);
		c1b.setTextureSize(128, 128);
		c1b.mirror = true;
		this.setRotation(c1b, 0F, 0F, 1.178097F);
		c1c = new LODModelPart(this, 0, 0);
		c1c.addBox(-4.5F, -4.5F, 0F, 9, 9, 1);
		c1c.setRotationPoint(0F, 15F, 2.5F);
		c1c.setTextureSize(128, 128);
		c1c.mirror = true;
		this.setRotation(c1c, 0F, 0F, 0.3926991F);
		c2 = new LODModelPart(this, 0, 0);
		c2.addBox(-4.5F, -4.5F, 0F, 9, 9, 1);
		c2.setRotationPoint(0F, 15F, 1F);
		c2.setTextureSize(128, 128);
		c2.mirror = true;
		this.setRotation(c2, 0F, 0F, 0.7853982F);
		c3 = new LODModelPart(this, 0, 0);
		c3.addBox(-4.5F, -4.5F, 0F, 9, 9, 1);
		c3.setRotationPoint(0F, 15F, -0.5F);
		c3.setTextureSize(128, 128);
		c3.mirror = true;
		this.setRotation(c3, 0F, 0F, 1.178097F);
		c4 = new LODModelPart(this, 0, 0);
		c4.addBox(-4.5F, -4.5F, 0F, 9, 9, 1);
		c4.setRotationPoint(0F, 15F, -2F);
		c4.setTextureSize(128, 128);
		c4.mirror = true;
		this.setRotation(c4, 0F, 0F, 1.178097F);
		c2a = new LODModelPart(this, 0, 0);
		c2a.addBox(-4.5F, -4.5F, 0F, 9, 9, 1);
		c2a.setRotationPoint(0F, 15F, 1F);
		c2a.setTextureSize(128, 128);
		c2a.mirror = true;
		this.setRotation(c2a, 0F, 0F, 0.3926991F);
		c2b = new LODModelPart(this, 0, 0);
		c2b.addBox(-4.5F, -4.5F, 0F, 9, 9, 1);
		c2b.setRotationPoint(0F, 15F, 1F);
		c2b.setTextureSize(128, 128);
		c2b.mirror = true;
		this.setRotation(c2b, 0F, 0F, 0F);
		c2c = new LODModelPart(this, 0, 0);
		c2c.addBox(-4.5F, -4.5F, 0F, 9, 9, 1);
		c2c.setRotationPoint(0F, 15F, 1F);
		c2c.setTextureSize(128, 128);
		c2c.mirror = true;
		this.setRotation(c2c, 0F, 0F, 1.178097F);
		c3a = new LODModelPart(this, 0, 0);
		c3a.addBox(-4.5F, -4.5F, 0F, 9, 9, 1);
		c3a.setRotationPoint(0F, 15F, -0.5F);
		c3a.setTextureSize(128, 128);
		c3a.mirror = true;
		this.setRotation(c3a, 0F, 0F, 0.3926991F);
		c3b = new LODModelPart(this, 0, 0);
		c3b.addBox(-4.5F, -4.5F, 0F, 9, 9, 1);
		c3b.setRotationPoint(0F, 15F, -0.5F);
		c3b.setTextureSize(128, 128);
		c3b.mirror = true;
		this.setRotation(c3b, 0F, 0F, 0F);
		c3c = new LODModelPart(this, 0, 0);
		c3c.addBox(-4.5F, -4.5F, 0F, 9, 9, 1);
		c3c.setRotationPoint(0F, 15F, -0.5F);
		c3c.setTextureSize(128, 128);
		c3c.mirror = true;
		this.setRotation(c3c, 0F, 0F, 0.7853982F);
		c4a = new LODModelPart(this, 0, 0);
		c4a.addBox(-4.5F, -4.5F, 0F, 9, 9, 1);
		c4a.setRotationPoint(0F, 15F, -2F);
		c4a.setTextureSize(128, 128);
		c4a.mirror = true;
		this.setRotation(c4a, 0F, 0F, 0.3926991F);
		c4b = new LODModelPart(this, 0, 0);
		c4b.addBox(-4.5F, -4.5F, 0F, 9, 9, 1);
		c4b.setRotationPoint(0F, 15F, -2F);
		c4b.setTextureSize(128, 128);
		c4b.mirror = true;
		this.setRotation(c4b, 0F, 0F, 0F);
		c4c = new LODModelPart(this, 0, 0);
		c4c.addBox(-4.5F, -4.5F, 0F, 9, 9, 1);
		c4c.setRotationPoint(0F, 15F, -2F);
		c4c.setTextureSize(128, 128);
		c4c.mirror = true;
		this.setRotation(c4c, 0F, 0F, 0.7853982F);
		c5a = new LODModelPart(this, 0, 0);
		c5a.addBox(-4.5F, -4.5F, 0F, 9, 9, 1);
		c5a.setRotationPoint(0F, 15F, -3.5F);
		c5a.setTextureSize(128, 128);
		c5a.mirror = true;
		this.setRotation(c5a, 0F, 0F, 0.3926991F);
		c5b = new LODModelPart(this, 0, 0);
		c5b.addBox(-4.5F, -4.5F, 0F, 9, 9, 1);
		c5b.setRotationPoint(0F, 15F, -3.5F);
		c5b.setTextureSize(128, 128);
		c5b.mirror = true;
		this.setRotation(c5b, 0F, 0F, 0F);
		c5c = new LODModelPart(this, 0, 0);
		c5c.addBox(-4.5F, -4.5F, 0F, 9, 9, 1);
		c5c.setRotationPoint(0F, 15F, -3.5F);
		c5c.setTextureSize(128, 128);
		c5c.mirror = true;
		this.setRotation(c5c, 0F, 0F, 1.178097F);
		Shape1ka = new LODModelPart(this, 0, 20);
		Shape1ka.addBox(-5F, -5F, 0F, 10, 10, 3);
		Shape1ka.setRotationPoint(0F, 15F, 4F);
		Shape1ka.setTextureSize(128, 128);
		Shape1ka.mirror = true;
		this.setRotation(Shape1ka, 0F, 0F, 0.3926991F);
		Shape1kb = new LODModelPart(this, 0, 35);
		Shape1kb.addBox(-5F, -5F, 0F, 10, 10, 3);
		Shape1kb.setRotationPoint(0F, 15F, -7F);
		Shape1kb.setTextureSize(128, 128);
		Shape1kb.mirror = true;
		this.setRotation(Shape1kb, 0F, 0F, 0.5890486F);
		Shape1kc = new LODModelPart(this, 0, 35);
		Shape1kc.addBox(-5F, -5F, 0F, 10, 10, 3);
		Shape1kc.setRotationPoint(0F, 15F, -7F);
		Shape1kc.setTextureSize(128, 128);
		Shape1kc.mirror = true;
		this.setRotation(Shape1kc, 0F, 0F, 1.374447F);
		Shape1kd = new LODModelPart(this, 0, 35);
		Shape1kd.addBox(-5F, -5F, 0F, 10, 10, 3);
		Shape1kd.setRotationPoint(0F, 15F, -7F);
		Shape1kd.setTextureSize(128, 128);
		Shape1kd.mirror = true;
		this.setRotation(Shape1kd, 0F, 0F, 0.9817477F);
		Shape1ke = new LODModelPart(this, 0, 20);
		Shape1ke.addBox(-5F, -5F, 0F, 10, 10, 3);
		Shape1ke.setRotationPoint(0F, 15F, 4F);
		Shape1ke.setTextureSize(128, 128);
		Shape1ke.mirror = true;
		this.setRotation(Shape1ke, 0F, 0F, 0.1963495F);
		Shape1kf = new LODModelPart(this, 0, 20);
		Shape1kf.addBox(-5F, -5F, 0F, 10, 10, 3);
		Shape1kf.setRotationPoint(0F, 15F, 4F);
		Shape1kf.setTextureSize(128, 128);
		Shape1kf.mirror = true;
		this.setRotation(Shape1kf, 0F, 0F, 1.374447F);
		Shape1kg = new LODModelPart(this, 0, 20);
		Shape1kg.addBox(-5F, -5F, 0F, 10, 10, 3);
		Shape1kg.setRotationPoint(0F, 15F, 4F);
		Shape1kg.setTextureSize(128, 128);
		Shape1kg.mirror = true;
		this.setRotation(Shape1kg, 0F, 0F, 0.9817477F);
		Shape1kh = new LODModelPart(this, 0, 20);
		Shape1kh.addBox(-5F, -5F, 0F, 10, 10, 3);
		Shape1kh.setRotationPoint(0F, 15F, 4F);
		Shape1kh.setTextureSize(128, 128);
		Shape1kh.mirror = true;
		this.setRotation(Shape1kh, 0F, 0F, 0.5890486F);

		Shape5 = new LODModelPart(this, 58, 70);
		Shape5.addBox(-0.5F, -8F, 0F, 1, 3, 12);
		Shape5.setRotationPoint(0F, 15F, -6F);
		Shape5.setTextureSize(128, 128);
		Shape5.mirror = true;
		this.setRotation(Shape5, 0F, 0F, -0.2617994F);
		Shape5a = new LODModelPart(this, 58, 70);
		Shape5a.addBox(-0.5F, -8F, 0F, 1, 3, 12);
		Shape5a.setRotationPoint(0F, 15F, -6F);
		Shape5a.setTextureSize(128, 128);
		Shape5a.mirror = true;
		this.setRotation(Shape5a, 0F, 0F, 0.2617994F);
		Shape5b = new LODModelPart(this, 58, 70);
		Shape5b.addBox(-0.5F, -8F, 0F, 1, 3, 12);
		Shape5b.setRotationPoint(0F, 15F, -6F);
		Shape5b.setTextureSize(128, 128);
		Shape5b.mirror = true;
		this.setRotation(Shape5b, 0F, 0F, -0.7853982F);
		Shape5c = new LODModelPart(this, 58, 70);
		Shape5c.addBox(-0.5F, -8F, 0F, 1, 3, 12);
		Shape5c.setRotationPoint(0F, 15F, -6F);
		Shape5c.setTextureSize(128, 128);
		Shape5c.mirror = true;
		this.setRotation(Shape5c, 0F, 0F, 0.7853982F);
		Shape5d = new LODModelPart(this, 58, 70);
		Shape5d.addBox(-0.5F, -8F, 0F, 1, 3, 12);
		Shape5d.setRotationPoint(0F, 15F, -6F);
		Shape5d.setTextureSize(128, 128);
		Shape5d.mirror = true;
		this.setRotation(Shape5d, 0F, 0F, 1.308997F);
		Shape5e = new LODModelPart(this, 58, 70);
		Shape5e.addBox(-0.5F, -8F, 0F, 1, 3, 12);
		Shape5e.setRotationPoint(0F, 15F, -6F);
		Shape5e.setTextureSize(128, 128);
		Shape5e.mirror = true;
		this.setRotation(Shape5e, 0F, 0F, -1.308997F);
		Shape5f = new LODModelPart(this, 58, 70);
		Shape5f.addBox(-0.5F, -8F, 0F, 1, 3, 12);
		Shape5f.setRotationPoint(0F, 15F, -6F);
		Shape5f.setTextureSize(128, 128);
		Shape5f.mirror = true;
		this.setRotation(Shape5f, 0F, 0F, 1.832596F);
		Shape5g = new LODModelPart(this, 58, 70);
		Shape5g.addBox(-0.5F, -8F, 0F, 1, 3, 12);
		Shape5g.setRotationPoint(0F, 15F, -6F);
		Shape5g.setTextureSize(128, 128);
		Shape5g.mirror = true;
		this.setRotation(Shape5g, 0F, 0F, -1.832596F);
	}

	@Override
	public void renderAll(TileEntity te, ArrayList li, float phi, float theta)
	{
		double d = 0.9375;
		GL11.glTranslated(0, d, 0);
		GL11.glRotatef(phi, 0, 0, 1);
		GL11.glTranslated(0, -d, 0);
		Shape2.render(te, f5);
		Shape2a.render(te, f5);
		GL11.glTranslated(0, d, 0);
		GL11.glRotatef(-phi, 0, 0, 1);
		GL11.glTranslated(0, -d, 0);

		Shape1.render(te, f5);
		Shape1a.render(te, f5);
		Shape1b.render(te, f5);
		Shape1c.render(te, f5);
		Shape1d.render(te, f5);
		Shape1e.render(te, f5);
		Shape1f.render(te, f5);
		Shape1g.render(te, f5);
		Shape1h.render(te, f5);
		Shape1u.render(te, f5);
		Shape1i.render(te, f5);
		Shape1k.render(te, f5);
		Shape1l.render(te, f5);
		Shape1m.render(te, f5);
		Shape1n.render(te, f5);
		Shape1o.render(te, f5);
		Shape1p.render(te, f5);
		Shape1q.render(te, f5);
		Shape1r.render(te, f5);
		Shape1s.render(te, f5);
		Shape3.render(te, f5);
		Shape4.render(te, f5);
		Shape4a.render(te, f5);
		Shape4b.render(te, f5);
		Shape4c.render(te, f5);

		Shape1ka.render(te, f5);
		Shape1kb.render(te, f5);
		Shape1kc.render(te, f5);
		Shape1kd.render(te, f5);
		Shape1ke.render(te, f5);
		Shape1kf.render(te, f5);
		Shape1kg.render(te, f5);
		Shape1kh.render(te, f5);

		//color code
		if (li.size() > 1) {
			int color = (Integer)li.get(1);
			float r = ReikaColorAPI.getRed(color)/255F;
			float g = ReikaColorAPI.getGreen(color)/255F;
			float b = ReikaColorAPI.getBlue(color)/255F;
			GL11.glPushAttrib(GL11.GL_ALL_ATTRIB_BITS);
			if (li.size() > 2 && (Boolean)li.get(2)) {
				GL11.glDisable(GL11.GL_LIGHTING);
				ReikaRenderHelper.disableLighting();
				ReikaRenderHelper.disableEntityLighting();
				GL11.glDisable(GL12.GL_RESCALE_NORMAL);
				GL11.glDisable(GL11.GL_NORMALIZE);
				GL11.glNormal3f(1, 1, 1);
			}
			GL11.glColor3f(r, g, b);
			Shape5.render(te, f5);
			Shape5a.render(te, f5);
			Shape5b.render(te, f5);
			Shape5c.render(te, f5);
			Shape5d.render(te, f5);
			Shape5e.render(te, f5);
			Shape5f.render(te, f5);
			Shape5g.render(te, f5);
			GL11.glPopAttrib();
		}

		double t = 0.25;
		double dz = 0.75;
		double dd = 0.125;
		double dl = 0;

		GL11.glScaled(1, 1, t);
		GL11.glTranslated(0, 0, dz);

		int num = (Integer)li.get(0);
		if (num == 2)
			dl = 0.2;
		if (num == 4)
			dl = 0.0625;
		dd *= 6-num;
		GL11.glTranslated(0, 0, -dl);
		if (num > 0) {
			for (double i = 0; i < 1.9; i += dd) {
				GL11.glTranslated(0, 0, -i);
				c1.render(te, f5);
				c1a.render(te, f5);
				c1b.render(te, f5);
				c1c.render(te, f5);
				GL11.glTranslated(0, 0, i);
			}
		}
		GL11.glTranslated(0, 0, dl);


		GL11.glTranslated(0, 0, -dz);
		GL11.glScaled(1, 1, 1D/t);
	}

	@Override
	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.setRotationAngles(f, f1, f2, f3, f4, f5);
	}

}
