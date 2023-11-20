package com.oop.cs2.ui;

import java.io.FileNotFoundException;

import com.oop.cs2.techServ.BlockSectionDA;

public class COMReport 
{
	public COMReport () throws FileNotFoundException
	{
		BlockSectionDA blockSectionDA =
				new BlockSectionDA();
		
	}
	public static void main(String[] args) throws FileNotFoundException
	{
		new COMReport();
	}
}
