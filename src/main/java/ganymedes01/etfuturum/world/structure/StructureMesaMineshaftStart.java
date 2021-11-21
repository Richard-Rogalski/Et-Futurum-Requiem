package ganymedes01.etfuturum.world.structure;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.gen.structure.StructureMineshaftPieces;
import net.minecraft.world.gen.structure.StructureMineshaftStart;

public class StructureMesaMineshaftStart extends StructureMineshaftStart {
	    private static final String __OBFID = "CL_00000450";

	    public StructureMesaMineshaftStart() {}

	    public StructureMesaMineshaftStart(World p_i2039_1_, Random p_i2039_2_, int p_i2039_3_, int p_i2039_4_)
	    {
	        this.field_143024_c = p_i2039_3_;
	        this.field_143023_d = p_i2039_4_;
	        StructureMineshaftPieces.Room room = new StructureMineshaftPieces.Room(0, p_i2039_2_, (p_i2039_3_ << 4) + 2, (p_i2039_4_ << 4) + 2);
	        this.components.add(room);
	        room.buildComponent(room, this.components, p_i2039_2_);
	        this.updateBoundingBox();
	        this.markAvailableHeight(p_i2039_1_, p_i2039_2_, 10);
	    }

}