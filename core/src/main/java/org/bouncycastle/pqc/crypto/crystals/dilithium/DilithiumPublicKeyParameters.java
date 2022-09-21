package org.bouncycastle.pqc.crypto.crystals.dilithium;

import org.bouncycastle.util.Arrays;

public class DilithiumPublicKeyParameters
    extends DilithiumKeyParameters
{
    final byte[] rho;
    final byte[] t1;

    public byte[] getRho()
    {
        return Arrays.clone(rho);
    }

    public byte[] getT1()
    {
        return Arrays.clone(t1);
    }

    public byte[] getEncoded()
    {
        return Arrays.concatenate(rho, t1);
    }

    public DilithiumPublicKeyParameters(DilithiumParameters params, byte[] rho, byte[] t1)
    {
        super(false, params);
        this.rho = Arrays.clone(rho);
        this.t1 = Arrays.clone(t1);
    }
}