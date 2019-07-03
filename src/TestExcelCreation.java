import java.io.File;

import java.io.FileNotFoundException;

import java.io.FileOutputStream;

import java.io.IOException;

import java.util.regex.Pattern;

import org.apache.poi.hssf.usermodel.HSSFRow;

import org.apache.poi.hssf.usermodel.HSSFSheet;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;

/**
 * 
 * Contains some methods to list files and folders from a directory
 * 
 * 
 * 
 * @author Loiane Groner http://loiane.com (Portuguese) http://loianegroner.com
 * 
 *         (English)
 */

public class TestExcelCreation {

	/**
	 * 
	 * List all the files and folders from a directory
	 * 
	 * 
	 * 
	 * @param directoryName
	 * 
	 *            to be listed
	 */

	static HSSFWorkbook hwb = new HSSFWorkbook();

	static int count = 0;

	String filename = "C:/Tools/hello.xls";

	static HSSFSheet sheet = hwb.createSheet("new sheet");

	static {

		HSSFRow rowhead = sheet.createRow((short) 0);

		rowhead.createCell((short) 0).setCellValue("SNo");

		rowhead.createCell((short) 1).setCellValue("File Path");

		rowhead.createCell((short) 2).setCellValue("File Type");

		rowhead.createCell((short) 3).setCellValue("Username");

		rowhead.createCell((short) 4).setCellValue("E-mail");

		rowhead.createCell((short) 5).setCellValue("Country");

	}

	public void listFilesAndFolders(String directoryName) {

		File directory = new File(directoryName);

		// get all the files from a directory

		File[] fList = directory.listFiles();

		for (File file : fList) {

			System.out.println(file.getName());

		}

	}

	/**
	 * 
	 * List all the files under a directory
	 * 
	 * 
	 * 
	 * @param directoryName
	 * 
	 *            to be listed
	 */

	public void listFiles(String directoryName) {

		File directory = new File(directoryName);

		// get all the files from a directory

		File[] fList = directory.listFiles();

		for (File file : fList) {

			if (file.isFile()) {

				System.out.println(file.getName());

			}

		}

	}

	/**
	 * 
	 * List all the folder under a directory
	 * 
	 * 
	 * 
	 * @param directoryName
	 * 
	 *            to be listed
	 */

	public void listFolders(String directoryName) {

		File directory = new File(directoryName);

		// get all the files from a directory

		File[] fList = directory.listFiles();

		for (File file : fList) {

			if (file.isDirectory()) {

				System.out.println(file.getName());

			}

		}

	}

	/**
	 * 
	 * List all files from a directory and its subdirectories
	 * 
	 * 
	 * 
	 * @param directoryName
	 * 
	 *            to be listed
	 * 
	 * @throws IOException
	 */

	public void listFilesAndFilesSubDirectories(String directoryName)

	throws IOException {

		File directory = new File(directoryName);

		// get all the files from a directory

		File[] fList = directory.listFiles();

		for (File file : fList) {

			if (file.isFile()) {

				String name = file.getAbsolutePath();

				String[] test = name.split("truesrce\\\\");

				String[] testK = test[1].split("\\\\");

				if (name.endsWith(".java")) {

					String[] subname = null;

					if (name.contains("ejbModule")) {

						subname = name.split("ejbModule\\\\");

					} else if (name.contains("test")) {

						subname = name.split("test\\\\");

					} else if (name.contains(".apt_generated")) {

						continue;

					} else if (name.contains("src")) {

						subname = name.split("src\\\\");

					}

					System.out.println(testK[0]);

					// System.out.println(subname[0] + "==" + subname[0]);

					String finalPath = subname[1].replaceAll("\\\\", ".");

					String fileType = finalPath.substring(finalPath

					.lastIndexOf(".") + 1);

					count++;

					// System.out.println(finalPath);

					/*
					 * 
					 * try {
					 * 
					 * 
					 * 
					 * HSSFRow row = sheet.createRow((short) count);
					 * 
					 * row.createCell((short) 0).setCellValue(count);
					 * 
					 * row.createCell((short) 1).setCellValue(finalPath);
					 * 
					 * row.createCell((short) 2).setCellValue(fileType);
					 * 
					 * row.createCell((short) 3).setCellValue("roseindia");
					 * 
					 * row.createCell((short) 4).setCellValue(
					 * 
					 * "hello@roseindia.net"); row.createCell((short)
					 * 
					 * 5).setCellValue("India");
					 * 
					 * 
					 * 
					 * //
					 * 
					 * System.out.println("Your excel file has been generated!"
					 * 
					 * ); } catch (Exception ex) { System.out.println(ex); }
					 */

					// System.out.println(finalPath.substring(finalPath.lastIndexOf(".")

					// + 1));

				}

				else if (name.endsWith(".jsp")) {

					String[] subname = null;

					if (name.contains("ejbModule")) {

						subname = name.split("ejbModule\\\\");

					} else if (name.contains("test")) {

						subname = name.split("test\\\\");

					} else if (name.contains(".apt_generated")) {

						continue;

					} else if (name.contains("src")) {

						subname = name.split("src\\\\");

					}

					System.out.println(testK[0]);

					// System.out.println(subname[0] + "==" + subname[0]);

					String finalPath = subname[1].replaceAll("\\\\", ".");

					String fileType = finalPath.substring(finalPath

					.lastIndexOf(".") + 1);

					count++;

					// System.out.println(finalPath);

					/*
					 * 
					 * try {
					 * 
					 * 
					 * 
					 * HSSFRow row = sheet.createRow((short) count);
					 * 
					 * row.createCell((short) 0).setCellValue(count);
					 * 
					 * row.createCell((short) 1).setCellValue(finalPath);
					 * 
					 * row.createCell((short) 2).setCellValue(fileType);
					 * 
					 * row.createCell((short) 3).setCellValue("roseindia");
					 * 
					 * row.createCell((short) 4).setCellValue(
					 * 
					 * "hello@roseindia.net"); row.createCell((short)
					 * 
					 * 5).setCellValue("India");
					 * 
					 * 
					 * 
					 * //
					 * 
					 * System.out.println("Your excel file has been generated!"
					 * 
					 * ); } catch (Exception ex) { System.out.println(ex); }
					 */

					// System.out.println(finalPath.substring(finalPath.lastIndexOf(".")

					// + 1));

				}

			} else if (file.isDirectory()) {

				listFilesAndFilesSubDirectories(file.getAbsolutePath());

			}

		}

		/*
		 * 
		 * FileOutputStream fileOut = new FileOutputStream(filename);
		 * 
		 * hwb.write(fileOut); fileOut.close();
		 */

	}

	public static void main(String[] args) throws IOException {

		Test listFilesUtil = new Test();

		// final String directoryLinuxMac ="/Users/loiane/test";

		// Windows directory example

		final String directoryWindows = "C://Tools//workspace//truesrce";

		/*
		 * 
		 * File directory = new File(directoryWindows);
		 * 
		 * 
		 * 
		 * // get all the files from a directory File[] fList =
		 * 
		 * directory.listFiles();
		 * 
		 * 
		 * 
		 * for (File file : fList) {
		 * 
		 * 
		 * 
		 * listFilesUtil.listFilesAndFilesSubDirectories(directoryWindows, hwb);
		 * 
		 * }
		 */

		// listFilesUtil.listFiles(directoryWindows);

		//listFilesUtil.listFilesAndFilesSubDirectories(directoryWindows);

		System.out.println(count);

		// listFilesUtil.listFilesAndFolders(directoryWindows);

		// listFilesUtil.listFolders(directoryWindows);

		System.out.println("end");

	}

}
