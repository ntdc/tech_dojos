package com.ntatc.katas.gildedrose;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class GildedRoseTest
{
    @Test
    public void should_do_nothing_when_called_updateQuality_input_empty_array( )
    {
        // Given
        Item[] items = new Item[0];
        GildedRose gildedRose = new GildedRose( items );
        // When
        gildedRose.updateQuality( );
        // Then
        // No exception should be raised
    }

    @Test
    public void should_return_quality_2_when_called_updateQuality_input_Aged_Brie_sellIn_0_quality_0( )
    {
        // Given
        Item[] items = new Item[1];
        items[0] = new Item( "Aged Brie", 0, 0 );
        GildedRose gildedRose = new GildedRose( items );
        // When
        gildedRose.updateQuality( );
        // Then
        Assertions.assertThat( items[0].quality ).isEqualTo( 2 );
    }


    @Test
    public void should_return_quality_75_when_called_updateQuality_input_Aged_Brie_sellIn_0_quality_75( )
    {
        // Given
        Item[] items = new Item[1];
        items[0] = new Item( "Aged Brie", 0, 75 );
        GildedRose gildedRose = new GildedRose( items );
        // When
        gildedRose.updateQuality( );
        // Then
        Assertions.assertThat( items[0].quality ).isEqualTo( 75 );
    }

    @Test
    public void should_return_quality_50_when_called_updateQuality_input_Aged_Brie_sellIn_minus_1_quality_49( )
    {
        // Given
        Item[] items = new Item[1];
        items[0] = new Item( "Aged Brie", -1, 49 );
        GildedRose gildedRose = new GildedRose( items );
        // When
        gildedRose.updateQuality( );
        // Then
        Assertions.assertThat( items[0].quality ).isEqualTo( 50 );
    }

    @Test
    public void should_return_quality_50_when_called_updateQuality_input_Aged_Brie_sellIn_minus_1_quality_50( )
    {
        // Given
        Item[] items = new Item[1];
        items[0] = new Item( "Aged Brie", -1, 50 );
        GildedRose gildedRose = new GildedRose( items );
        // When
        gildedRose.updateQuality( );
        // Then
        Assertions.assertThat( items[0].quality ).isEqualTo( 50 );
    }


    @Test
    public void should_return_quality_0_when_called_updateQuality_input_Backstage_sellIn_0_quality_75( )
    {
        // Given
        Item[] items = new Item[1];
        items[0] = new Item( "Backstage passes to a TAFKAL80ETC concert", 0, 75 );
        GildedRose gildedRose = new GildedRose( items );
        // When
        gildedRose.updateQuality( );
        // Then
        Assertions.assertThat( items[0].quality ).isEqualTo( 0 );
    }

    @Test
    public void should_return_quality_0_when_called_updateQuality_input_Backstage_sellIn_0_quality_50( )
    {
        // Given
        Item[] items = new Item[1];
        items[0] = new Item( "Backstage passes to a TAFKAL80ETC concert", 0, 50 );
        GildedRose gildedRose = new GildedRose( items );
        // When
        gildedRose.updateQuality( );
        // Then
        Assertions.assertThat( items[0].quality ).isEqualTo( 0 );
    }

    @Test
    public void should_return_quality_0_when_called_updateQuality_input_Backstage_sellIn_0_quality_49( )
    {
        // Given
        Item[] items = new Item[1];
        items[0] = new Item( "Backstage passes to a TAFKAL80ETC concert", 0, 49 );
        GildedRose gildedRose = new GildedRose( items );
        // When
        gildedRose.updateQuality( );
        // Then
        Assertions.assertThat( items[0].quality ).isEqualTo( 0 );
    }


    @Test
    public void should_return_quality_0_when_called_updateQuality_input_Backstage_sellIn_0_quality_48( )
    {
        // Given
        Item[] items = new Item[1];
        items[0] = new Item( "Backstage passes to a TAFKAL80ETC concert", 0, 48 );
        GildedRose gildedRose = new GildedRose( items );
        // When
        gildedRose.updateQuality( );
        // Then
        Assertions.assertThat( items[0].quality ).isEqualTo( 0 );
    }

    @Test
    public void should_return_quality_0_when_called_updateQuality_input_Backstage_sellIn_5_quality_40( )
    {
        // Given
        Item[] items = new Item[1];
        items[0] = new Item( "Backstage passes to a TAFKAL80ETC concert", 5, 40 );
        GildedRose gildedRose = new GildedRose( items );
        // When
        gildedRose.updateQuality( );
        // Then
        Assertions.assertThat( items[0].quality ).isEqualTo( 43 );
    }

    @Test
    public void should_return_quality_0_when_called_updateQuality_input_Backstage_sellIn_6_quality_40( )
    {
        // Given
        Item[] items = new Item[1];
        items[0] = new Item( "Backstage passes to a TAFKAL80ETC concert", 6, 40 );
        GildedRose gildedRose = new GildedRose( items );
        // When
        gildedRose.updateQuality( );
        // Then
        Assertions.assertThat( items[0].quality ).isEqualTo( 42 );
    }


    @Test
    public void should_return_quality_50_when_called_updateQuality_input_Backstage_sellIn_1_quality_48( )
    {
        // Given
        Item[] items = new Item[1];
        items[0] = new Item( "Backstage passes to a TAFKAL80ETC concert", 1, 48 );
        GildedRose gildedRose = new GildedRose( items );
        // When
        gildedRose.updateQuality( );
        // Then
        Assertions.assertThat( items[0].quality ).isEqualTo( 50 );
    }

    @Test
    public void should_return_quality_50_when_called_updateQuality_input_Backstage_sellIn_2_quality_48( )
    {
        // Given
        Item[] items = new Item[1];
        items[0] = new Item( "Backstage passes to a TAFKAL80ETC concert", 2, 48 );
        GildedRose gildedRose = new GildedRose( items );
        // When
        gildedRose.updateQuality( );
        // Then
        Assertions.assertThat( items[0].quality ).isEqualTo( 50 );
    }

    @Test
    public void should_return_quality_50_when_called_updateQuality_input_Backstage_sellIn_5_quality_50( )
    {
        // Given
        Item[] items = new Item[1];
        items[0] = new Item( "Backstage passes to a TAFKAL80ETC concert", 5, 50 );
        GildedRose gildedRose = new GildedRose( items );
        // When
        gildedRose.updateQuality( );
        // Then
        Assertions.assertThat( items[0].quality ).isEqualTo( 50 );
    }

    @Test
    public void should_return_quality_50_when_called_updateQuality_input_Backstage_sellIn_5_quality_49( )
    {
        // Given
        Item[] items = new Item[1];
        items[0] = new Item( "Backstage passes to a TAFKAL80ETC concert", 5, 49 );
        GildedRose gildedRose = new GildedRose( items );
        // When
        gildedRose.updateQuality( );
        // Then
        Assertions.assertThat( items[0].quality ).isEqualTo( 50 );
    }


    @Test
    public void should_return_quality_47_when_called_updateQuality_input_Backstage_sellIn_10_quality_45( )
    {
        // Given
        Item[] items = new Item[1];
        items[0] = new Item( "Backstage passes to a TAFKAL80ETC concert", 10, 45 );
        GildedRose gildedRose = new GildedRose( items );
        // When
        gildedRose.updateQuality( );
        // Then
        Assertions.assertThat( items[0].quality ).isEqualTo( 47 );
    }

    @Test
    public void should_return_quality_46_when_called_updateQuality_input_Backstage_sellIn_11_quality_45( )
    {
        // Given
        Item[] items = new Item[1];
        items[0] = new Item( "Backstage passes to a TAFKAL80ETC concert", 11, 45 );
        GildedRose gildedRose = new GildedRose( items );
        // When
        gildedRose.updateQuality( );
        // Then
        Assertions.assertThat( items[0].quality ).isEqualTo( 46 );
    }

    @Test
    public void should_return_quality_50_when_called_updateQuality_input_Sulfuras_sellIn_10_quality_50( )
    {
        // Given
        Item[] items = new Item[1];
        items[0] = new Item( "Sulfuras, Hand of Ragnaros", 10, 50 );
        GildedRose gildedRose = new GildedRose( items );
        // When
        gildedRose.updateQuality( );
        // Then
        Assertions.assertThat( items[0].quality ).isEqualTo( 50 );
    }

    @Test
    public void should_return_quality_49_when_called_updateQuality_input_Toto_sellIn_10_quality_50( )
    {
        // Given
        Item[] items = new Item[1];
        items[0] = new Item( "Toto", 10, 50 );
        GildedRose gildedRose = new GildedRose( items );
        // When
        gildedRose.updateQuality( );
        // Then
        Assertions.assertThat( items[0].quality ).isEqualTo( 49 );
    }


    @Test
    public void should_return_quality_0_when_called_updateQuality_input_Toto_sellIn_10_quality_0( )
    {
        // Given
        Item[] items = new Item[1];
        items[0] = new Item( "Toto", 10, 0 );
        GildedRose gildedRose = new GildedRose( items );
        // When
        gildedRose.updateQuality( );
        // Then
        Assertions.assertThat( items[0].quality ).isEqualTo( 0 );
    }

    @Test
    public void should_return_quality_8_when_called_updateQuality_input_Toto_sellIn_minus_1_quality_10( )
    {
        // Given
        Item[] items = new Item[1];
        items[0] = new Item( "Toto", -1, 10 );
        GildedRose gildedRose = new GildedRose( items );
        // When
        gildedRose.updateQuality( );
        // Then
        Assertions.assertThat( items[0].quality ).isEqualTo( 8 );
    }

    @Test
    public void should_return_quality_0_when_called_updateQuality_input_Toto_sellIn_minus_1_quality_1( )
    {
        // Given
        Item[] items = new Item[1];
        items[0] = new Item( "Toto", -1, 1 );
        GildedRose gildedRose = new GildedRose( items );
        // When
        gildedRose.updateQuality( );
        // Then
        Assertions.assertThat( items[0].quality ).isEqualTo( 0 );
    }

    @Test
    public void should_return_quality_0_when_called_updateQuality_input_Toto_sellIn_minus_1_quality_0( )
    {
        // Given
        Item[] items = new Item[1];
        items[0] = new Item( "Toto", -1, 0 );
        GildedRose gildedRose = new GildedRose( items );
        // When
        gildedRose.updateQuality( );
        // Then
        Assertions.assertThat( items[0].quality ).isEqualTo( 0 );
    }

    @Test
    public void should_return_quality_44_when_called_updateQuality_input_Toto_sellIn_5_quality_45( )
    {
        // Given
        Item[] items = new Item[1];
        items[0] = new Item( "Toto", 5, 45 );
        GildedRose gildedRose = new GildedRose( items );
        // When
        gildedRose.updateQuality( );
        // Then
        Assertions.assertThat( items[0].quality ).isEqualTo( 44 );
    }


    @Test
    public void should_return_quality_44_when_called_updateQuality_input_Toto_sellIn_6_quality_45( )
    {
        // Given
        Item[] items = new Item[1];
        items[0] = new Item( "Toto", 6, 45 );
        GildedRose gildedRose = new GildedRose( items );
        // When
        gildedRose.updateQuality( );
        // Then
        Assertions.assertThat( items[0].quality ).isEqualTo( 44 );
    }

    @Test
    public void should_return_quality_0_when_called_updateQuality_input_Toto_sellIn_10_quality_1( )
    {
        // Given
        Item[] items = new Item[1];
        items[0] = new Item( "Toto", 10, 1 );
        GildedRose gildedRose = new GildedRose( items );
        // When
        gildedRose.updateQuality( );
        // Then
        Assertions.assertThat( items[0].quality ).isEqualTo( 0 );
    }

    @Test
    public void should_return_quality_49_when_called_updateQuality_input_Toto_sellIn_minus1_quality_50( )
    {
        // Given
        Item[] items = new Item[1];
        items[0] = new Item( "Toto", -1, 50 );
        GildedRose gildedRose = new GildedRose( items );
        // When
        gildedRose.updateQuality( );
        // Then
        Assertions.assertThat( items[0].quality ).isEqualTo( 48 );
    }
}
