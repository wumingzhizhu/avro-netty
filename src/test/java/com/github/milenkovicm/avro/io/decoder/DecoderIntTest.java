package com.github.milenkovicm.avro.io.decoder;

import java.util.Collection;

import org.apache.avro.generic.GenericRecord;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.github.milenkovicm.avro.DataHelper;
import com.github.milenkovicm.avro.Helper;

@RunWith(Parameterized.class)
public class DecoderIntTest extends AbstractDecoderTest {

    int value;

    public DecoderIntTest(final int value) {
        this.value = value;
    }

    @Parameterized.Parameters(name = "value={0}")
    public static Collection<?> data() {
        return DataHelper.integers();
    }

    @Test
    public void test_plus_value() {
        final GenericRecord originalValue = Helper.genericInt(this.value);
        this.test(originalValue);
    }

    @Test
    public void test_minus_value() {
        final GenericRecord originalValue = Helper.genericInt(-this.value);
        this.test(originalValue);
    }
}
